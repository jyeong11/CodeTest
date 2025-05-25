-- 첫번쨰 MySQL
select b.book_id, a.author_name, date_format(b.published_date,'%Y-%m-%d')
  from book b 
  join author a
    on b.author_id = a.author_id
 where b.category = '경제'
 order by b.published_date;
 
-- 두번째 Oracle
 select b.book_id, a.author_name, TO_CHAR(b.published_date, 'YYYY-MM-DD') as published_date
  from book b
  join author a
    on b.author_id = a.author_id
 where b.category = '경제' 
 order by published_date;