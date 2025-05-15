-- 첫번째 풀이방식
-- SELECT F.FLAVOR
-- FROM FIRST_HALF F
-- LEFT JOIN JULY J ON F.FLAVOR = J.FLAVOR
-- GROUP BY F.FLAVOR
-- ORDER BY (F.TOTAL_ORDER +SUM(J.TOTAL_ORDER)) DESC
-- LIMIT 3;

-- 두번째 풀이방식
select flavor
  from (select flavor, sum(total_order) as total
          from (select * from first_half
                 union 
                select * from july) a
         group by flavor
        having sum(total_order)) b
 order by total desc
 limit 3;