select i.rest_id,
       i.rest_name,
       i.food_type,
       i.favorites,
       i.address,
       (select round(avg(review_score),2)
          from rest_review r
         where i.rest_id = r.rest_id
         group by r.rest_id) as score
  from rest_info i
 where address like '서울%'
   and exists (select *
                 from rest_review r
                where i.rest_id = r.rest_id)
 order by score desc, favorites desc;