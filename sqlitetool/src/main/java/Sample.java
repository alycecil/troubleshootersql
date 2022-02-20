import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Sample {
    String dbLoc;


    public Sample(String dbLoc) {
        this.dbLoc = dbLoc;
    }

    public static void main(String[] args) throws Exception {
        String dbLoc;
        if (args == null || args.length == 0) {
            dbLoc = "C:\\Program Files (x86)\\Steam\\steamapps\\common\\Troubleshooter\\Release\\bin\\saves\\game.sav";
        } else {
            dbLoc = args[0];
        }

        new Sample(dbLoc).backupDB().doSql();
    }

    private Sample backupDB() throws IOException {

        File f = new File(dbLoc);
        File bak = new File(f.getParentFile(), f.getName() + new Date().getTime() + ".bak");

        IOUtils.copy(f.toURL(), bak);
        return this;
    }

    Sample doSql() {
        Connection connection = null;
        try {
            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:" + dbLoc);

            for (String theStatement : TheLazyAndWrongWayToDoThis.theStatements) {
                try (Statement statement = connection.createStatement();) {
                    statement.setQueryTimeout(30);  // set timeout to 30 sec.

//            ResultSet rs = statement.executeQuery("select * from roster");
//            while (rs.next()) {
//                // read the result set
//                System.out.println("name = " + rs.getString("rosterName"));
//                System.out.println("id = " + rs.getInt("rosterID"));
//            }

                    statement.executeUpdate(theStatement);
                }
            }
        } catch (SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }
        return this;
    }
}
