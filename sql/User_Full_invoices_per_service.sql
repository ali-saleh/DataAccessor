select 
    c.user_id,
    inv.id,
    cf.content  'full name',
    inv.create_datetime,
    il.quantity,
    il.amount,
    c.city
from
    invoice_line il,
    invoice inv,
    contact c,
    contact_field cf
where
    inv.deleted = 0 AND inv.is_review = 0
        AND il.invoice_id = inv.id
        AND inv.user_id = c.user_id
        AND cf.contact_id = c.id
        AND cf.type_id = 432;

select 
    c.user_id,
    cf.content 'full name',
    it.internal_number,
	d.content 'description',
    sum(il.quantity),
    sum(il.amount)
from
    invoice_line il,
    invoice inv,
    contact c,
    contact_field cf,
    item it,
	international_description d
where
    inv.deleted = 0 AND inv.is_review = 0
        AND il.invoice_id = inv.id
        AND inv.user_id = c.user_id
        AND cf.contact_id = c.id
        AND il.item_id = it.id
		AND it.id=d.foreign_id
		AND d.table_id=14	#for items' table
        AND cf.type_id = 432
        AND c.user_id = 500	#example user id
group by il.item_id;

select 
    it.internal_number,
	d.content 'description',
    ip.price 'unit price',
    sum(il.quantity),
    sum(il.amount)
from
    invoice_line il,
    invoice inv,
    item_price ip,
    item it,
	international_description d
where
    inv.deleted = 0 AND inv.is_review = 0
        AND il.invoice_id = inv.id
        AND il.item_id = it.id
		AND it.id=d.foreign_id
		AND d.table_id=14
group by il.item_id;

# Report for all selling based on user, (using view, ordering can be done easily)
select 
    c.user_id,
    cf.content 'full name',
    inv.create_datetime,
    il.quantity,
    il.amount,
    c.city
from
    invoice_line il,
    invoice inv,
    contact c,
    contact_field cf
where
    inv.deleted = 0 AND inv.is_review = 0
        AND il.invoice_id = inv.id
        AND inv.user_id = c.user_id
        AND cf.contact_id = c.id
        AND cf.type_id = 432;