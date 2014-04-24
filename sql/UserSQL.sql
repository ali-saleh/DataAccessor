(select 
    c.user_id 'user_id',
    cf.content 'fullname',
    cf1.content 'username',
	b.currency_id 'currency',
	c.city 'city',
    sum(i.total) 'payments'
from
	base_user b
    join contact c on c.user_id = b.id
        join
    invoice i ON i.user_id = c.user_id AND i.deleted = 0
        AND i.is_review = 0
		AND i.status_id = 27
        AND i.currency_id = 12
        join
    contact_field cf ON cf.contact_id = c.id
        AND cf.type_id = 432
        join
    contact_field cf1 ON cf1.contact_id = c.id
        AND cf1.type_id = 434
		join
	contact_field cf2 on cf2.contact_id = c.id
		AND cf2.type_id = 435
Where 
	cf2.content = 2160 
group by c.user_id
order by sum(i.total));

select 
    cf.content 'type',
	ol.item_id 'item',
	ol.description,
	count(distinct c.id) 'number'
from
    contact c
        join
    purchase_order po ON po.user_id = c.user_id
        AND po.active_until >= '2012-4-1' -- should be date of today for having up-to-date results
		AND po.deleted=0 
join order_line ol on ol.order_id = po.id -- AND ol.item_id = 1403
join item_type_map itm on itm.item_id = ol.item_id AND itm.type_id not in (10901,103,102) -- refer to item_type (to remove not recurring items)
		join
	contact_field cf on cf.contact_id = c.id AND cf.type_id = 441 -- billable_type (person/company) !!
group by  ol.item_id, cf.content;


select 
	il.item_id,
	it.internal_number,
	cf.content,
	count(i.id)
from
invoice i
join invoice_line il on il.invoice_id = i.id
join item it on it.id = il.item_id
join user_role_map urm on urm.user_id = i.user_id AND urm.role_id = 5
join contact c on c.user_id=urm.user_id
	AND c.deleted=0
	AND c.city = 1
	AND c.create_datetime >= "2012-3-1"
	AND c.create_datetime <= "2012-4-30"
left join contact_field cf on cf.contact_id = c.id AND cf.type_id = 441
join contact_field cf1 on cf1.contact_id = c.id AND cf1.type_id = 435
-- join contact_field cf2 on cf2.contact_id = c.id AND cf2.type_id = 443
-- 
where 
	cf1.content = 2160

-- where i.create_datetime >= "2012-8-7"
-- AND i.create_datetime <= "2012-8-7"
group by il.item_id, cf.content;







select custom.user_id user,
custom.last_active,
ol.item_id,
ol.description

 from
(
select po.user_id user_id,
	po.id order_id,
	max(po.active_until) last_active
from purchase_order po 
join order_process op on op.order_id = po.id
where po.deleted = 0
group by po.user_id) custom

join order_line ol on ol.order_id = custom.order_id

where custom.last_active < "2011-06-1"


