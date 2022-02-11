-- INSERT INTO "main"."itemProperty" ("itemID", "masterIndex", "propValue")
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
order by item.itemID, F.masterIndex