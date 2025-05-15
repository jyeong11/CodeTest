select id
  from ecoli_data
 where parent_id in (select id -- 2세대
                       from ecoli_data
                      where parent_id in (select id  -- 1세대
                                            from ecoli_data
                                           where parent_id is null))