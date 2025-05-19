-- 첫번째 문제풀이(MySQL)
-- 서브쿼리로 풀고싶었는데 더 복잡한 쿼리문이 나오는 것 같음
select pr.product_id, pr.product_name, sum(pr.price * od.amount) as total_sales
  from food_product pr
  join food_order od on pr.product_id = od.product_id
 where od.produce_date like '2022-05%'
 group by product_id, product_name
 order by 3 desc, 1;
 
 -- 두번째 문제풀이(oracle)
 -- 문제에서 produce_date 컬럼이 date타입으로 되어있는데
 -- MySQL은 date타입이 자동으로 '2022-05%'(문자 리터럴이) 자동형변환이 됨
 -- oracle은 자동형변환이 안됨 
 -- 그래서 '2022-05-01'와 '2022-05-31' 같은 문자 리터럴을 date타입으로 명시적 형변환을 해야한다는 걸 알게되었음
 select fd.product_id, fd.product_name, sum(fd.price * fo.amount) as total_sales
  from food_product fd
  join food_order fo
    on fd.product_id = fo.product_id
 where fo.produce_date between to_date('2022-05-01', 'YYYY-MM-DD') 
                           and to_date('2022-05-31', 'YYYY-MM-DD')
 group by fd.product_id, fd.product_name
 order by total_sales desc, fd.product_id;