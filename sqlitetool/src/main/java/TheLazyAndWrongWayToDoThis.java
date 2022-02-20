public class TheLazyAndWrongWayToDoThis {
    public static final String[] theStatements = new String[]{
            "INSERT INTO \"main\".\"itemProperty\" (\"itemID\", \"masterIndex\", \"propValue\")\n" +
                    "SELECT item.itemID, F.masterIndex, F.value\n" +
                    "-- select *\n" +
                    "from item \n" +
                    "left join (\n" +
                    "select itemProperty.masterIndex, itemProperty.itemID, itemProperty.propValue, itemPropertyMaster.masterName\n" +
                    "from itemProperty\n" +
                    "join itemPropertyMaster \n" +
                    "on itemProperty.masterIndex = itemPropertyMaster.masterIndex\n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value1'\n" +
                    ") as X on item.itemID = X.itemID\n" +
                    "join (\n" +
                    "select itemPropertyMaster.masterIndex, itemPropertyMaster.masterName, \n" +
                    "CASE itemPropertyMaster.masterName\n" +
                    "WHEN 'Option/Type1' THEN 'MoveDist'\n" +
                    "WHEN 'Option/Type2' THEN 'RegenVigor'\n" +
                    "WHEN 'Option/Type3' THEN 'MaxVigor'\n" +
                    "WHEN 'Option/Type4' THEN 'Speed'\n" +
                    "WHEN 'Option/Type5' THEN 'MaxHP'\n" +
                    "WHEN 'Option/Value1' THEN '1'\n" +
                    "WHEN 'Option/Value2' THEN '100'\n" +
                    "WHEN 'Option/Value3' THEN '150'\n" +
                    "WHEN 'Option/Value4' THEN '100'\n" +
                    "WHEN 'Option/Value5' THEN '500'\n" +
                    "ELSE NULL\n" +
                    "END as value\n" +
                    "from itemPropertyMaster \n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value%'\n" +
                    "OR itemPropertyMaster.masterName like 'Option/Type%'\n" +
                    ") as F on 1=1\n" +
                    "where X.masterIndex is NULL\n" +
                    "and item.itemCount = 1\n" +
                    "and F.value IS NOT NULL\n" +
                    "order by item.itemID, F.masterIndex\n" +
                    "",

            "INSERT INTO \"main\".\"itemProperty\" (\"itemID\", \"masterIndex\", \"propValue\")\n" +
                    "SELECT item.itemID, F.masterIndex, F.value\n" +
                    "-- select *\n" +
                    "from item \n" +
                    "left join (\n" +
                    "select itemProperty.masterIndex, itemProperty.itemID, itemProperty.propValue, itemPropertyMaster.masterName\n" +
                    "from itemProperty\n" +
                    "join itemPropertyMaster \n" +
                    "on itemProperty.masterIndex = itemPropertyMaster.masterIndex\n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value2'\n" +
                    ") as X on item.itemID = X.itemID\n" +
                    "join (\n" +
                    "select itemPropertyMaster.masterIndex, itemPropertyMaster.masterName, \n" +
                    "CASE itemPropertyMaster.masterName\n" +
                    "WHEN 'Option/Type2' THEN 'OverchargeDuration'\n" +
                    "WHEN 'Option/Type3' THEN 'MaxVigor'\n" +
                    "WHEN 'Option/Type4' THEN 'Speed'\n" +
                    "WHEN 'Option/Type5' THEN 'ESPPower'\n" +
                    "WHEN 'Option/Value2' THEN '100'\n" +
                    "WHEN 'Option/Value3' THEN '150'\n" +
                    "WHEN 'Option/Value4' THEN '100'\n" +
                    "WHEN 'Option/Value5' THEN '500'\n" +
                    "ELSE NULL\n" +
                    "END as value\n" +
                    "from itemPropertyMaster \n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value%'\n" +
                    "OR itemPropertyMaster.masterName like 'Option/Type%'\n" +
                    ") as F on 1=1\n" +
                    "where X.masterIndex is NULL\n" +
                    "and item.itemCount = 1\n" +
                    "and F.value IS NOT NULL\n" +
                    "order by item.itemID, F.masterIndex\n" +
                    "",

            "INSERT INTO \"main\".\"itemProperty\" (\"itemID\", \"masterIndex\", \"propValue\")\n" +
                    "SELECT item.itemID, F.masterIndex, F.value\n" +
                    "-- select *\n" +
                    "from item \n" +
                    "left join (\n" +
                    "select itemProperty.masterIndex, itemProperty.itemID, itemProperty.propValue, itemPropertyMaster.masterName\n" +
                    "from itemProperty\n" +
                    "join itemPropertyMaster \n" +
                    "on itemProperty.masterIndex = itemPropertyMaster.masterIndex\n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value3'\n" +
                    ") as X on item.itemID = X.itemID\n" +
                    "join (\n" +
                    "select itemPropertyMaster.masterIndex, itemPropertyMaster.masterName, \n" +
                    "CASE itemPropertyMaster.masterName\n" +
                    "WHEN 'Option/Type3' THEN 'Accuracy'\n" +
                    "WHEN 'Option/Type4' THEN 'AttackPower'\n" +
                    "WHEN 'Option/Type5' THEN 'ESPPower'\n" +
                    "WHEN 'Option/Value3' THEN '150'\n" +
                    "WHEN 'Option/Value4' THEN '1500'\n" +
                    "WHEN 'Option/Value5' THEN '1500'\n" +
                    "ELSE NULL\n" +
                    "END as value\n" +
                    "from itemPropertyMaster \n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value%'\n" +
                    "OR itemPropertyMaster.masterName like 'Option/Type%'\n" +
                    ") as F on 1=1\n" +
                    "where X.masterIndex is NULL\n" +
                    "and item.itemCount = 1\n" +
                    "and F.value IS NOT NULL\n" +
                    "order by item.itemID, F.masterIndex\n" +
                    "",

            "INSERT INTO \"main\".\"itemProperty\" (\"itemID\", \"masterIndex\", \"propValue\")\n" +
                    "SELECT item.itemID, F.masterIndex, F.value\n" +
                    "-- select *\n" +
                    "from item \n" +
                    "left join (\n" +
                    "select itemProperty.masterIndex, itemProperty.itemID, itemProperty.propValue, itemPropertyMaster.masterName\n" +
                    "from itemProperty\n" +
                    "join itemPropertyMaster \n" +
                    "on itemProperty.masterIndex = itemPropertyMaster.masterIndex\n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value4'\n" +
                    ") as X on item.itemID = X.itemID\n" +
                    "join (\n" +
                    "select itemPropertyMaster.masterIndex, itemPropertyMaster.masterName, \n" +
                    "CASE itemPropertyMaster.masterName\n" +
                    "WHEN 'Option/Type4' THEN 'ESPPower'\n" +
                    "WHEN 'Option/Type5' THEN 'OverchargeDuration'\n" +
                    "WHEN 'Option/Value4' THEN '100'\n" +
                    "WHEN 'Option/Value5' THEN '20'\n" +
                    "ELSE NULL\n" +
                    "END as value\n" +
                    "from itemPropertyMaster \n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value%'\n" +
                    "OR itemPropertyMaster.masterName like 'Option/Type%'\n" +
                    ") as F on 1=1\n" +
                    "where X.masterIndex is NULL\n" +
                    "and item.itemCount = 1\n" +
                    "and F.value IS NOT NULL\n" +
                    "order by item.itemID, F.masterIndex\n" +
                    "",


            "INSERT INTO \"main\".\"itemProperty\" (\"itemID\", \"masterIndex\", \"propValue\")\n" +
                    "SELECT item.itemID, F.masterIndex, F.value\n" +
                    "-- select *\n" +
                    "from item \n" +
                    "left join (\n" +
                    "select itemProperty.masterIndex, itemProperty.itemID, itemProperty.propValue, itemPropertyMaster.masterName\n" +
                    "from itemProperty\n" +
                    "join itemPropertyMaster \n" +
                    "on itemProperty.masterIndex = itemPropertyMaster.masterIndex\n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value5'\n" +
                    ") as X on item.itemID = X.itemID\n" +
                    "join (\n" +
                    "select itemPropertyMaster.masterIndex, itemPropertyMaster.masterName, \n" +
                    "CASE itemPropertyMaster.masterName\n" +
                    "WHEN 'Option/Type5' THEN 'OverchargeDuration'\n" +
                    "WHEN 'Option/Value5' THEN '10'\n" +
                    "ELSE NULL\n" +
                    "END as value\n" +
                    "from itemPropertyMaster \n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value%'\n" +
                    "OR itemPropertyMaster.masterName like 'Option/Type%'\n" +
                    ") as F on 1=1\n" +
                    "where X.masterIndex is NULL\n" +
                    "and item.itemCount = 1\n" +
                    "and F.value IS NOT NULL\n" +
                    "order by item.itemID, F.masterIndex\n" +
                    "",

            "update companyProperty\n" +
                    "set cpValue = 9999\n" +
                    "where masterIndex in (select masterIndex from companyPropertyMaster where masterName like '%Amount')\n" +
                    "",
            "update item \n" +
                    "set itemCount = 88888\n" +
                    "where ( itemCount > 1 and itemCount < 100)\n" +
                    "or (itemCount > 91111)\n" +
                    "",
            "update itemProperty\n" +
                    "set propValue = 98\n" +
                    "where masterIndex in (\n" +
                    "      SELECT masterIndex from itemPropertyMaster where masterName like 'Option/Value%'\n" +
                    "  )\n" +
                    "and propValue > 2\n" +
                    "\n" +
                    "",
            "update itemProperty\n" +
                    "set propValue = 500\n" +
                    "WHERE\n" +
                    "(itemProperty.itemID || '-' ||  itemProperty.masterIndex) IN\n" +
                    "(\n" +
                    "select (itemProperty.itemID || '-' ||  itemProperty.masterIndex)\n" +
                    "--## select itemProperty.itemID, itemProperty.masterIndex,  itemProperty.propValue, whichProp.propValue, whichMaster.masterName\n" +
                    "from itemProperty\n" +
                    "join itemPropertyMaster \n" +
                    "on itemProperty.masterIndex = itemPropertyMaster.masterIndex\n" +
                    "join itemPropertyMaster as whichMaster \n" +
                    "on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)\n" +
                    "join itemProperty as whichProp \n" +
                    "on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID\n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value%'\n" +
                    "and whichMaster.masterName like 'Option/Type%'\n" +
                    "and whichProp.propValue IN (\"MaxHP\", \"ESPPower\", \"AttackPower\")\n" +
                    "order by itemProperty.itemID, itemProperty.masterIndex\n" +
                    ")\n" +
                    "",
            "update itemProperty\n" +
                    "set propValue = \"OverchargeDuration\"\n" +
                    "WHERE\n" +
                    "(itemProperty.itemID || '-' ||  itemProperty.masterIndex) IN\n" +
                    "(\n" +
                    "select (whichProp.itemID || '-' ||  whichProp.masterIndex)\n" +
                    "--## select itemProperty.itemID, itemProperty.masterIndex,  itemProperty.propValue, whichProp.propValue, whichMaster.masterName\n" +
                    "from itemProperty\n" +
                    "join itemPropertyMaster \n" +
                    "on itemProperty.masterIndex = itemPropertyMaster.masterIndex\n" +
                    "join itemPropertyMaster as whichMaster \n" +
                    "on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)\n" +
                    "join itemProperty as whichProp \n" +
                    "on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID\n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value%'\n" +
                    "and whichMaster.masterName like 'Option/Type%'\n" +
                    "and whichProp.propValue IN (\n" +
                    "\"IncreaseCriticalStrikeChance_Lightning\", \n" +
                    "\"IncreaseCriticalStrikeChance_Slashing\"\n" +
                    ")\n" +
                    "order by itemProperty.itemID, itemProperty.masterIndex\n" +
                    ")\n" +
                    "",
            "update itemProperty\n" +
                    "set propValue = \"MaxVigor\"\n" +
                    "WHERE\n" +
                    "(itemProperty.itemID || '-' ||  itemProperty.masterIndex) IN\n" +
                    "(\n" +
                    "select (whichProp.itemID || '-' ||  whichProp.masterIndex)\n" +
                    "--## select itemProperty.itemID, itemProperty.masterIndex,  itemProperty.propValue, whichProp.propValue, whichMaster.masterName\n" +
                    "from itemProperty\n" +
                    "join itemPropertyMaster \n" +
                    "on itemProperty.masterIndex = itemPropertyMaster.masterIndex\n" +
                    "join itemPropertyMaster as whichMaster \n" +
                    "on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)\n" +
                    "join itemProperty as whichProp \n" +
                    "on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID\n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value%'\n" +
                    "and whichMaster.masterName like 'Option/Type%'\n" +
                    "and whichProp.propValue IN (\n" +
                    "\"IncreaseCriticalStrikeChance_Slashing\", \n" +
                    "\"IncreaseHitRate_Fire\",\n" +
                    "\"IncreaseHitRate_Ice\",\n" +
                    "\"IncreaseHitRate_Wind\"\n" +
                    ")\n" +
                    "order by itemProperty.itemID, itemProperty.masterIndex\n" +
                    ")\n" +
                    "",
            "update itemProperty\n" +
                    "set propValue = \"ESPPower\"\n" +
                    "WHERE\n" +
                    "(itemProperty.itemID || '-' ||  itemProperty.masterIndex) IN\n" +
                    "(\n" +
                    "select (whichProp.itemID || '-' ||  whichProp.masterIndex)\n" +
                    "--## select itemProperty.itemID, itemProperty.masterIndex,  itemProperty.propValue, whichProp.propValue, whichMaster.masterName\n" +
                    "from itemProperty\n" +
                    "join itemPropertyMaster \n" +
                    "on itemProperty.masterIndex = itemPropertyMaster.masterIndex\n" +
                    "join itemPropertyMaster as whichMaster \n" +
                    "on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)\n" +
                    "join itemProperty as whichProp \n" +
                    "on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID\n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value%'\n" +
                    "and whichMaster.masterName like 'Option/Type%'\n" +
                    "and whichProp.propValue IN (\n" +
                    "\"IncreaseCriticalStrikeDeal_Earth\",\n" +
                    "\"IncreaseCriticalStrikeChance_Earth\",\n" +
                    "\"IncreaseHitRate_Earth\"\n" +
                    ")\n" +
                    "order by itemProperty.itemID, itemProperty.masterIndex\n" +
                    ")\n" +
                    "",
            "update itemProperty\n" +
                    "set propValue = \"AttackPower\"\n" +
                    "WHERE\n" +
                    "(itemProperty.itemID || '-' ||  itemProperty.masterIndex) IN\n" +
                    "(\n" +
                    "select (whichProp.itemID || '-' ||  whichProp.masterIndex)\n" +
                    "--## select itemProperty.itemID, itemProperty.masterIndex,  itemProperty.propValue, whichProp.propValue, whichMaster.masterName\n" +
                    "from itemProperty\n" +
                    "join itemPropertyMaster \n" +
                    "on itemProperty.masterIndex = itemPropertyMaster.masterIndex\n" +
                    "join itemPropertyMaster as whichMaster \n" +
                    "on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)\n" +
                    "join itemProperty as whichProp \n" +
                    "on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID\n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value%'\n" +
                    "and whichMaster.masterName like 'Option/Type%'\n" +
                    "and whichProp.propValue IN (\n" +
                    "\"IncreaseCriticalStrikeChance_Blunt\",\n" +
                    "\"IncreaseHitRate_Slashing\"\n" +
                    ")\n" +
                    "order by itemProperty.itemID, itemProperty.masterIndex\n" +
                    ")\n" +
                    "",
            "update itemProperty\n" +
                    "set propValue = \"MoveDist\"\n" +
                    "WHERE\n" +
                    "(itemProperty.itemID || '-' ||  itemProperty.masterIndex) IN\n" +
                    "(\n" +
                    "select (whichProp.itemID || '-' ||  whichProp.masterIndex)\n" +
                    "--## select itemProperty.itemID, itemProperty.masterIndex,  itemProperty.propValue, whichProp.propValue, whichMaster.masterName\n" +
                    "from itemProperty\n" +
                    "join itemPropertyMaster \n" +
                    "on itemProperty.masterIndex = itemPropertyMaster.masterIndex\n" +
                    "join itemPropertyMaster as whichMaster \n" +
                    "on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)\n" +
                    "join itemProperty as whichProp \n" +
                    "on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID\n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value%'\n" +
                    "and whichMaster.masterName like 'Option/Type%'\n" +
                    "and whichProp.propValue IN (\n" +
                    "\"IncreaseHitRate_Piercing\",\n" +
                    "\"IncreaseCriticalStrikeChance_Piercing\",\n" +
                    "\"IncreaseHitRate_Water\",\n" +
                    "\"IncreaseCriticalStrikeDeal_Piercing\"\n" +
                    ")\n" +
                    "order by itemProperty.itemID, itemProperty.masterIndex\n" +
                    ")\n" +
                    "",
            "update itemProperty\n" +
                    "set propValue = 1\n" +
                    "WHERE\n" +
                    "(itemProperty.itemID || '-' ||  itemProperty.masterIndex) IN\n" +
                    "(\n" +
                    "select (itemProperty.itemID || '-' ||  itemProperty.masterIndex)\n" +
                    "--## select itemProperty.itemID, itemProperty.masterIndex,  itemProperty.propValue, whichProp.propValue, whichMaster.masterName\n" +
                    "from itemProperty\n" +
                    "join itemPropertyMaster \n" +
                    "on itemProperty.masterIndex = itemPropertyMaster.masterIndex\n" +
                    "join itemPropertyMaster as whichMaster \n" +
                    "on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)\n" +
                    "join itemProperty as whichProp \n" +
                    "on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID\n" +
                    "WHERE itemPropertyMaster.masterName like 'Option/Value%'\n" +
                    "and whichMaster.masterName like 'Option/Type%'\n" +
                    "and whichProp.propValue IN (\"MoveDist\")\n" +
                    "order by itemProperty.itemID, itemProperty.masterIndex\n" +
                    ")\n" +
                    "",
            "update rosterProperty\n" +
                    "set rpValue = 'Revered'\n" +
                    "where masterIndex IN (\n" +
                    "\tSELECT masterIndex from rosterPropertyMaster\n" +
                    "\twhere masterName like 'Friendship/%/Rank'\n" +
                    ")\n" +
                    "",
            "update rosterProperty\n" +
                    "set rpValue = '1'\n" +
                    "where masterIndex IN (\n" +
                    "\tSELECT masterIndex from rosterPropertyMaster\n" +
                    "\twhere masterName like 'Friendship/%/Value'\n" +
                    ")\n" +
                    ""

    };

}
