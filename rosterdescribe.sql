select * 
from roster
join rosterProperty on roster.rosterID = rosterProperty.rosterID
join rosterPropertyMaster on rosterProperty.masterIndex = rosterPropertyMaster.masterIndex
-- where roster.rosterID = 15
order by roster.rosterID


;
SELECT masterIndex from rosterPropertyMaster
	where masterName like 'Friendship/%/Rank'
;
update rosterProperty
set rpValue = 'Revered'
where masterIndex IN (
	SELECT masterIndex from rosterPropertyMaster
	where masterName like 'Friendship/%/Rank'
)
;
update rosterProperty
set rpValue = '1'
where masterIndex IN (
	SELECT masterIndex from rosterPropertyMaster
	where masterName like 'Friendship/%/Value'
)
;