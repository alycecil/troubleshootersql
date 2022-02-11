update companyProperty
set cpValue = 9999
where masterIndex in (select masterIndex from companyPropertyMaster where masterName like '%Amount')
;
update item 
set itemCount = 88888
where ( itemCount > 1 and itemCount < 100)
or (itemCount > 91111)
;
update itemProperty
set propValue = 98
where masterIndex in (
      SELECT masterIndex from itemPropertyMaster where masterName like 'Option/Value%'
  )
and propValue > 2

;



;
update itemProperty
set propValue = 500
WHERE
(itemProperty.itemID || '-' ||  itemProperty.masterIndex) IN
(
select (itemProperty.itemID || '-' ||  itemProperty.masterIndex)
--## select itemProperty.itemID, itemProperty.masterIndex,  itemProperty.propValue, whichProp.propValue, whichMaster.masterName
from itemProperty
join itemPropertyMaster 
on itemProperty.masterIndex = itemPropertyMaster.masterIndex
join itemPropertyMaster as whichMaster 
on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)
join itemProperty as whichProp 
on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID
WHERE itemPropertyMaster.masterName like 'Option/Value%'
and whichMaster.masterName like 'Option/Type%'
and whichProp.propValue IN ("MaxHP", "ESPPower", "AttackPower")
order by itemProperty.itemID, itemProperty.masterIndex
)
;
update itemProperty
set propValue = "OverchargeDuration"
WHERE
(itemProperty.itemID || '-' ||  itemProperty.masterIndex) IN
(
select (whichProp.itemID || '-' ||  whichProp.masterIndex)
--## select itemProperty.itemID, itemProperty.masterIndex,  itemProperty.propValue, whichProp.propValue, whichMaster.masterName
from itemProperty
join itemPropertyMaster 
on itemProperty.masterIndex = itemPropertyMaster.masterIndex
join itemPropertyMaster as whichMaster 
on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)
join itemProperty as whichProp 
on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID
WHERE itemPropertyMaster.masterName like 'Option/Value%'
and whichMaster.masterName like 'Option/Type%'
and whichProp.propValue IN (
"IncreaseCriticalStrikeChance_Lightning", 
"IncreaseCriticalStrikeChance_Slashing"
)
order by itemProperty.itemID, itemProperty.masterIndex
)
;
update itemProperty
set propValue = "MaxVigor"
WHERE
(itemProperty.itemID || '-' ||  itemProperty.masterIndex) IN
(
select (whichProp.itemID || '-' ||  whichProp.masterIndex)
--## select itemProperty.itemID, itemProperty.masterIndex,  itemProperty.propValue, whichProp.propValue, whichMaster.masterName
from itemProperty
join itemPropertyMaster 
on itemProperty.masterIndex = itemPropertyMaster.masterIndex
join itemPropertyMaster as whichMaster 
on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)
join itemProperty as whichProp 
on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID
WHERE itemPropertyMaster.masterName like 'Option/Value%'
and whichMaster.masterName like 'Option/Type%'
and whichProp.propValue IN (
"IncreaseCriticalStrikeChance_Slashing", 
"IncreaseHitRate_Fire",
"IncreaseHitRate_Ice",
"IncreaseHitRate_Wind"
)
order by itemProperty.itemID, itemProperty.masterIndex
)
;
update itemProperty
set propValue = "MoveDist"
WHERE
(itemProperty.itemID || '-' ||  itemProperty.masterIndex) IN
(
select (whichProp.itemID || '-' ||  whichProp.masterIndex)
--## select itemProperty.itemID, itemProperty.masterIndex,  itemProperty.propValue, whichProp.propValue, whichMaster.masterName
from itemProperty
join itemPropertyMaster 
on itemProperty.masterIndex = itemPropertyMaster.masterIndex
join itemPropertyMaster as whichMaster 
on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)
join itemProperty as whichProp 
on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID
WHERE itemPropertyMaster.masterName like 'Option/Value%'
and whichMaster.masterName like 'Option/Type%'
and whichProp.propValue IN (
"IncreaseHitRate_Piercing",
"IncreaseCriticalStrikeChance_Piercing",
"IncreaseHitRate_Water",
"IncreaseCriticalStrikeDeal_Piercing"
)
order by itemProperty.itemID, itemProperty.masterIndex
)
;
update itemProperty
set propValue = 1
WHERE
(itemProperty.itemID || '-' ||  itemProperty.masterIndex) IN
(
select (itemProperty.itemID || '-' ||  itemProperty.masterIndex)
--## select itemProperty.itemID, itemProperty.masterIndex,  itemProperty.propValue, whichProp.propValue, whichMaster.masterName
from itemProperty
join itemPropertyMaster 
on itemProperty.masterIndex = itemPropertyMaster.masterIndex
join itemPropertyMaster as whichMaster 
on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)
join itemProperty as whichProp 
on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID
WHERE itemPropertyMaster.masterName like 'Option/Value%'
and whichMaster.masterName like 'Option/Type%'
and whichProp.propValue IN ("MoveDist")
order by itemProperty.itemID, itemProperty.masterIndex
)
;
