select distinct whichProp.propValue
from itemProperty
join itemPropertyMaster 
on itemProperty.masterIndex = itemPropertyMaster.masterIndex
join itemPropertyMaster as whichMaster 
on substr(whichMaster.masterName,12,1) = substr(itemPropertyMaster.masterName,13,1)
join itemProperty as whichProp 
on whichMaster.masterIndex = whichProp.masterIndex and itemProperty.itemID = whichProp.itemID
WHERE itemPropertyMaster.masterName like 'Option/Value%'
and whichMaster.masterName like 'Option/Type%'
order by itemProperty.itemID, itemProperty.masterIndex


