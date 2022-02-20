INSERT INTO "main"."itemProperty" ("itemID", "masterIndex", "propValue")
SELECT item.itemID, F.masterIndex, F.value
-- select *
from item 
left join (
select itemProperty.masterIndex, itemProperty.itemID, itemProperty.propValue, itemPropertyMaster.masterName
from itemProperty
join itemPropertyMaster 
on itemProperty.masterIndex = itemPropertyMaster.masterIndex
WHERE itemPropertyMaster.masterName like 'Option/Value1'
) as X on item.itemID = X.itemID
join (
select itemPropertyMaster.masterIndex, itemPropertyMaster.masterName, 
CASE itemPropertyMaster.masterName
WHEN 'Option/Type1' THEN 'MoveDist'
WHEN 'Option/Type2' THEN 'RegenVigor'
WHEN 'Option/Type3' THEN 'MaxVigor'
WHEN 'Option/Type4' THEN 'Speed'
WHEN 'Option/Type5' THEN 'MaxHP'
WHEN 'Option/Value1' THEN '1'
WHEN 'Option/Value2' THEN '100'
WHEN 'Option/Value3' THEN '150'
WHEN 'Option/Value4' THEN '100'
WHEN 'Option/Value5' THEN '500'
ELSE NULL
END as value
from itemPropertyMaster 
WHERE itemPropertyMaster.masterName like 'Option/Value%'
OR itemPropertyMaster.masterName like 'Option/Type%'
) as F on 1=1
where X.masterIndex is NULL
and item.itemCount = 1
and F.value IS NOT NULL
order by item.itemID, F.masterIndex
;
INSERT INTO "main"."itemProperty" ("itemID", "masterIndex", "propValue")
SELECT item.itemID, F.masterIndex, F.value
-- select *
from item 
left join (
select itemProperty.masterIndex, itemProperty.itemID, itemProperty.propValue, itemPropertyMaster.masterName
from itemProperty
join itemPropertyMaster 
on itemProperty.masterIndex = itemPropertyMaster.masterIndex
WHERE itemPropertyMaster.masterName like 'Option/Value2'
) as X on item.itemID = X.itemID
join (
select itemPropertyMaster.masterIndex, itemPropertyMaster.masterName, 
CASE itemPropertyMaster.masterName
WHEN 'Option/Type2' THEN 'OverchargeDuration'
WHEN 'Option/Type3' THEN 'MaxVigor'
WHEN 'Option/Type4' THEN 'Speed'
WHEN 'Option/Type5' THEN 'ESPPower'
WHEN 'Option/Value2' THEN '100'
WHEN 'Option/Value3' THEN '150'
WHEN 'Option/Value4' THEN '100'
WHEN 'Option/Value5' THEN '500'
ELSE NULL
END as value
from itemPropertyMaster 
WHERE itemPropertyMaster.masterName like 'Option/Value%'
OR itemPropertyMaster.masterName like 'Option/Type%'
) as F on 1=1
where X.masterIndex is NULL
and item.itemCount = 1
and F.value IS NOT NULL
order by item.itemID, F.masterIndex
;
INSERT INTO "main"."itemProperty" ("itemID", "masterIndex", "propValue")
SELECT item.itemID, F.masterIndex, F.value
-- select *
from item 
left join (
select itemProperty.masterIndex, itemProperty.itemID, itemProperty.propValue, itemPropertyMaster.masterName
from itemProperty
join itemPropertyMaster 
on itemProperty.masterIndex = itemPropertyMaster.masterIndex
WHERE itemPropertyMaster.masterName like 'Option/Value3'
) as X on item.itemID = X.itemID
join (
select itemPropertyMaster.masterIndex, itemPropertyMaster.masterName, 
CASE itemPropertyMaster.masterName
WHEN 'Option/Type3' THEN 'Accuracy'
WHEN 'Option/Type4' THEN 'AttackPower'
WHEN 'Option/Type5' THEN 'ESPPower'
WHEN 'Option/Value3' THEN '150'
WHEN 'Option/Value4' THEN '1500'
WHEN 'Option/Value5' THEN '1500'
ELSE NULL
END as value
from itemPropertyMaster 
WHERE itemPropertyMaster.masterName like 'Option/Value%'
OR itemPropertyMaster.masterName like 'Option/Type%'
) as F on 1=1
where X.masterIndex is NULL
and item.itemCount = 1
and F.value IS NOT NULL
order by item.itemID, F.masterIndex
;
INSERT INTO "main"."itemProperty" ("itemID", "masterIndex", "propValue")
SELECT item.itemID, F.masterIndex, F.value
-- select *
from item 
left join (
select itemProperty.masterIndex, itemProperty.itemID, itemProperty.propValue, itemPropertyMaster.masterName
from itemProperty
join itemPropertyMaster 
on itemProperty.masterIndex = itemPropertyMaster.masterIndex
WHERE itemPropertyMaster.masterName like 'Option/Value4'
) as X on item.itemID = X.itemID
join (
select itemPropertyMaster.masterIndex, itemPropertyMaster.masterName, 
CASE itemPropertyMaster.masterName
WHEN 'Option/Type4' THEN 'ESPPower'
WHEN 'Option/Type5' THEN 'OverchargeDuration'
WHEN 'Option/Value4' THEN '100'
WHEN 'Option/Value5' THEN '20'
ELSE NULL
END as value
from itemPropertyMaster 
WHERE itemPropertyMaster.masterName like 'Option/Value%'
OR itemPropertyMaster.masterName like 'Option/Type%'
) as F on 1=1
where X.masterIndex is NULL
and item.itemCount = 1
and F.value IS NOT NULL
order by item.itemID, F.masterIndex
;
INSERT INTO "main"."itemProperty" ("itemID", "masterIndex", "propValue")
SELECT item.itemID, F.masterIndex, F.value
-- select *
from item 
left join (
select itemProperty.masterIndex, itemProperty.itemID, itemProperty.propValue, itemPropertyMaster.masterName
from itemProperty
join itemPropertyMaster 
on itemProperty.masterIndex = itemPropertyMaster.masterIndex
WHERE itemPropertyMaster.masterName like 'Option/Value5'
) as X on item.itemID = X.itemID
join (
select itemPropertyMaster.masterIndex, itemPropertyMaster.masterName, 
CASE itemPropertyMaster.masterName
WHEN 'Option/Type5' THEN 'OverchargeDuration'
WHEN 'Option/Value5' THEN '10'
ELSE NULL
END as value
from itemPropertyMaster 
WHERE itemPropertyMaster.masterName like 'Option/Value%'
OR itemPropertyMaster.masterName like 'Option/Type%'
) as F on 1=1
where X.masterIndex is NULL
and item.itemCount = 1
and F.value IS NOT NULL
order by item.itemID, F.masterIndex
;