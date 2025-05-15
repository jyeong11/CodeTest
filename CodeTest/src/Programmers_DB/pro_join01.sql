select a.car_id, a.car_type, a.fee 
  from (select cc.car_id, cc.car_type, 
        round((cc.daily_fee * 30) - (cc.daily_fee * cp.discount_rate/100) * 30, 0) AS fee
        from car_rental_company_car cc
        join car_rental_company_discount_plan cp
          on cc.car_type = cp.car_type
       where not exists (select 1
                           from car_rental_company_rental_history ch
                          where cc.car_id = ch.car_id
                            AND NOT (ch.end_date < '2022-11-01' OR ch.start_date > '2022-11-30'))
         and cc.car_type in ('세단', 'SUV')
         and cp.duration_type = '30일 이상') a
 where a.fee between 500000 and 2000000
 order by 3 desc, 2, 1 desc;