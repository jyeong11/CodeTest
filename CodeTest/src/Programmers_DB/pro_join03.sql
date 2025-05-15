SELECT pr.product_id, pr.product_name, sum(pr.price * od.amount) as total_sales
  from food_product pr
  join food_order od 
    on pr.product_id = od.product_id
 where od.produce_date like '2022-05%'
 group by product_id, product_name
 order by 3 desc, 1;