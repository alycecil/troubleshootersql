# troubleshooter : abandoned children save editor sql
This is various sql scripts for the save games of the video game troubleshooter. 
Troubleshooter uses sqlite as its game state engine and simply creates a couple files in `%steamapp%\Troubleshooter\Release\bin\saves` for me this is `C:\Program Files (x86)\Steam\steamapps\common\Troubleshooter\Release\bin\saves`

These scripts are for offline mode of the game and only for the file `game.sav`, they do not update the history `log.sav.`

# Usage
- To use these scripts, download and install sqlite
- Open the `game.sav` file
- Go to the `Execute SQL` tab
- copy and paste the sql scripts you want from github, likely just `main.sql`
- hit the triangle play button without the line.
- press `Write Changes`

# Version of SQLite Used:

DB Browser for SQLite Version 3.12.2

Built for x86_64-little_endian-llp64, running on x86_64
Qt Version 5.12.8
SQLite Version 3.35.5.
