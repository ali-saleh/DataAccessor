SELECT trim(substring(substring_index(lower((trim(rad.value))),' ',2),3)) x
 FROM radius.radcheck rad where rad.Attribute = 'Expiration' 
group by x
  order by lower(trim(rad.value));-- and length(lower(trim(rad.value)))>11

select * from radius.radcheck rad where rad.Attribute = 'Expiration'
and  STR_TO_DATE(rad.value, '%d %b %Y') >="2015-1-1";

select * from radius.radcheck rad where rad.Attribute = 'Expiration'
and rad.value like '%2015%';

select * from radius.radcheck rad where rad.Attribute = 'Expiration'
and rad.value like '%2020%';

select * from radius.radcheck rad where rad.Attribute = 'Expiration'
and rad.value like '%2023%';


