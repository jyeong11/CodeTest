-- 서브쿼리를 쓸때에 아직까지 limit를 잘 활용하지 못함
-- 항상 select절에만 집계함수를 쓰는게 익숙하다 보니 order by절에서 사용하는게 아직 어색함
-- 이 쿼리문에서는 그룹바이를 한 루 오더바이 실행이 되니까 select절에서 집계함수를 사용하지 않아도 그룹바이 필수!
select mp.member_name, rr.review_text, date_format(rr.review_date, '%Y-%m-%d') as REVIEW_DATE
  from member_profile mp 
  join rest_review rr on mp.member_id = rr.member_id
 where mp.member_id = (select member_id
                         from rest_review
                         group by member_id
                        order by count(member_id) desc
                        limit 1) 
 order by rr.review_date, rr.review_text;