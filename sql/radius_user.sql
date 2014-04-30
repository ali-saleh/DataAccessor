SELECT 
    trim(substring(substring_index(lower((trim(rad.value))), ' ', 2),
            3)) x
FROM
    radius.radcheck rad
where
    rad.Attribute = 'Expiration'
group by x
order by lower(trim(rad.value));-- and length(lower(trim(rad.value)))>11

select 
    *
from
    radius.radcheck rad
where
    rad.Attribute = 'Expiration'
        and STR_TO_DATE(rad.value, '%d %b %Y') >= '2015-1-1';



select 
    c.PID 'username',
    c.CustomerName 'fullname',
    c.city 'cityString',
    rug.groupname 'catagory',
    max(STR_TO_DATE(rc.value, '%d %b %Y')) 'activeUntil',
    ui.lastname 'catInfo'
from
    radius.customer c
        join
    radius.radusergroup rug ON rug.username = c.PID
        join
    radius.radcheck rc ON rc.username = c.PID
        and rc.attribute = 'Expiration'
        join
    radius.userinfo ui ON ui.username = c.PID
where
    c.status = 'active'
	AND c.city like "Ramallah"
group by c.PID

