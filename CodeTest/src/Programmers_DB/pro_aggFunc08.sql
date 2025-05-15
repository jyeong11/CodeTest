select f.id as ID, fn.fish_name as FISH_NAME, length as LENGTH
  from fish_info f 
  join fish_name_info fn
    on f.fish_type = fn.fish_type
 where f.length in (select max(length) 
                      from fish_info
                     where fish_type = f.fish_type)
 order by f.id;