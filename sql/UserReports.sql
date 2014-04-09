select 
	urm.user_id 'user number',
	cf2.content 'username',
	cf1.content 'fullname'
from 
user_role_map urm
join contact c on urm.role_id = 5 AND c.user_id = urm.user_id AND c.deleted = false
join contact_field cf1 on cf1.contact_id = c.id AND cf1.type_id = 432
join contact_field cf2 on cf2.contact_id = c.id AND cf2.type_id = 434;
