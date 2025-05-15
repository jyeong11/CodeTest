-- 회원정보 user_info gender컬럼은 비어있거나 0또는 1의 값 들어가있음
-- online 테이블은 온라인 상품판매
-- 집계함수 제외 select 컬럼은 제발!!! 그룹바이로 묶어주삼
select year(o.sales_date) as YEAR, 
       month(o.sales_date) as MONTH, 
       count(distinct o.user_id) as PURCHASED_USERS, 
       round(count(distinct o.user_id) / (select count(user_id) 
                                            from user_info 
                                           where joined like '2021%'), 1) as PURCHASED_RATIO
  from user_info i join online_sale o
    on i.user_id = o.user_id
 where i.joined like '2021%'
 group by YEAR, MONTH
 order by YEAR, MONTH;