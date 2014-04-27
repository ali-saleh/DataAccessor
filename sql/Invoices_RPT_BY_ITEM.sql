select 
    rpt.item_id,
    rpt.description,
    sum(subqnt) qnt,
    count(distinct sub_ord_cnt) num_orders,
    sum(sub_amt) amount
from
    (SELECT 
        i_0 . *,
            i_0.quantity as subqnt,
            op.order_id as sub_ord_cnt,
            i_0.amount + if(i_1.price is null, 0, (i_0.amount * if(i_1.price is null, - 1, sum(i_1.price) / 100))) as sub_amt
    FROM
        invoice_line i_0
    Left outer join order_process op ON i_0.invoice_id = op.invoice_id
    Left outer join invoice_line i_1 ON i_0.invoice_id = i_1.invoice_id
        and i_0.item_id not in (select 
            it.id
        from
            item it
        where
            it.percentage is not null)
        and i_1.item_id not in (select 
            it.id
        from
            item it
        where
            it.percentage is null)
    where
        i_0.invoice_id in (select 
                inv.id
            from
                invoice inv
            where
                inv.user_id in (select 
                        con.user_id
                    from
                        contact con
					join contact_field cf on cf.contact_id = con.id and cf.type_id = 435
                    where
                        con.city <> 0
					and cf.content = 2160)
                    and inv.create_datetime >= '2012-3-1'
                    and inv.create_datetime < '2012-4-30'
                    and inv.currency_id = 12
                    and inv.deleted = 0
                    and inv.is_review = 0)
    group by i_0.invoice_id , i_0.item_id) rpt
group by rpt.item_id;
--
  -- --                 and inv.user_id in (select 
     --                   con.user_id
       --             from
         --               contact con
           --         where
            --            con.city <> 0)