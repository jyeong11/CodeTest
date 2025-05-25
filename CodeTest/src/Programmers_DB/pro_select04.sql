select dr_name, dr_id, mcdp_cd, to_char(hire_ymd, 'YYYY-MM-DD') AS hire_ymd
  from doctor
 where mcdp_cd in ('CS', 'GS')
 order by hire_ymd desc, mcdp_cd;