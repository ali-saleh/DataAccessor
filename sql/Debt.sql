select user_id,  (invoice_balance - payment_balance) balance, 
cf.content 'full name',
cf1.content 'username',
c.city 'city'
from (
select 
    i.user_id id, sum(balance) invoice_balance, ifnull(v.payment_balance, 0) payment_balance
from
	invoice i left join (select 
    user_id, sum(balance) as payment_balance
from
    payment
where
	deleted = 0 
and 
    user_id in (select 
            b.id
        from
            base_user b
        where
            b.entity_id = 1
                and b.currency_id = 12
                and b.deleted = 0)
group by user_id) v
on 
	i.user_id = v.user_id where
	i.deleted = 0 and
    i.user_id in (select 
            b.id
        from
            base_user b
        where
            b.entity_id = 1
                and b.currency_id = 12
                and b.deleted = 0)
group by i.user_id
union
select 
    i.user_id id, sum(balance) invoice_balance, ifnull(v.payment_balance, 0) payment_balance
from
    invoice i right join (select 
    user_id, sum(balance) as payment_balance
from
    payment
where
	-- balance <> 0 
	-- AND
	deleted = 0 
and 
    user_id in (select 
            b.id
        from
            base_user b
        where
            b.entity_id = 1
                and b.currency_id = 12
                and b.deleted = 0)
group by user_id) v
on 
	i.user_id = v.user_id where
	i.deleted = 0 and
    i.user_id in (select 
            b.id
        from
            base_user b
        where
            b.entity_id = 1
                and b.currency_id = 12
                and b.deleted = 0)
group by v.user_id
) cc 
join contact c on c.user_id = cc.id
join contact_field cf on cf.contact_id = c.id and cf.type_id = 432
join contact_field cf1 on cf1.contact_id = c.id and cf1.type_id = 434
where (invoice_balance - payment_balance) > 0;