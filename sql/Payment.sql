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
		
select 
    p.id as p_id,
    b.user_name as user_id,
    cf.content as fullname,
    p.create_datetime as c_time,
    (p.amount) as amount,
    GROUP_CONCAT(pi.invoice_id
        SEPARATOR ',') as invoices
from
    payment p
        join
    base_user b ON p.user_id = b.id and b.deleted = 0
        join
    contact c ON c.user_id = p.user_id and c.city <> 0
        join
    contact_field cf ON cf.contact_id = c.id
        AND cf.type_id = 432
        left join
    payment_invoice pi ON pi.payment_id = p.id
WHERE
    (p.deleted = 1 AND p.method_id = 10
        AND p.currency_id = 12
        AND p.create_datetime >= '2012-3-1'
        AND p.create_datetime < '2012-4-30')
group by p_id;
