select 
    p.id, cf.content, p.create_datetime, p.amount as amount, b.user_name
from
    payment p,
    base_user b,
    contact c,
	contact_field cf
where
    b.entity_id = 1
        and p.user_id = b.id
        and p.user_id = c.user_id
		and c.id = cf.contact_id
        and p.payment_date >= '2012-3-1'
        and p.payment_date < '2012-4-30'
        and p.currency_id = 12
		and p.method_id = 10
        and p.deleted = 1
		and cf.type_id=432;
