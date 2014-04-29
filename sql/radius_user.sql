SELECT trim(substring(substring_index(lower((trim(rad.value))),' ',2),3)) x
 FROM radius.radcheck rad where rad.Attribute = 'Expiration' 
group by x
  order by lower(trim(rad.value));-- and length(lower(trim(rad.value)))>11

select * from radius.radcheck rad where rad.Attribute = 'Expiration'
and  STR_TO_DATE(rad.value, '%d %b %Y') >="2015-1-1";



select 
    c.PID, c.CustomerName, rug.groupname, rc.value, 
	STR_TO_DATE(rc.value, '%d %b %Y')
from
    radius.customer c
        join
    radius.radusergroup rug ON rug.username = c.PID
        join
    radius.radcheck rc ON rc.username = c.PID
        and rc.attribute = 'Expiration'

	where c.status = 'active'
and STR_TO_DATE(rc.value, '%d %b %Y') > "2013-12-31"

