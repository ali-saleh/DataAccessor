SELECT 
    b.id 'Number',
    b.user_name 'ID',
    cf1.content 'Full name',
    cf2.content 'Type',
    sum(i.total) 'Sum of invoices',
    sum(i.balance) 'Remaining balance'
FROM
    base_user b,
    contact c,
    contact_field cf1,
    contact_field cf2,
    invoice i
WHERE
    b.id = c.user_id
        AND i.user_id = c.user_id
        AND cf1.contact_id = c.user_id
		AND cf2.contact_id = c.user_id
        AND cf1.type_id = 432
        AND cf2.type_id = 439
        AND i.currency_id = 1
        AND i.deleted = 0
        AND i.is_review = 0
GROUP BY b.id;

SELECT 
il.item_id 'service number',
il.description 'item name',
cf.content 'user type',
count(distinct c.user_id) 'number of users'
FROM
    contact c,
    contact_field cf,
    invoice_line il,
	invoice i
WHERE
    i.user_id = c.user_id
        AND cf.contact_id = c.user_id
        AND cf.type_id = 439
        AND i.currency_id = 1
        AND i.deleted = 0
        AND i.is_review = 0
GROUP BY il.item_id, cf.content
