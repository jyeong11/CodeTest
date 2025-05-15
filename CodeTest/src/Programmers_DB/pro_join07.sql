--
select animal_id, name
  from animal_ins ai
 where exists (select 1
                 from animal_outs ao
                where ai.animal_id = ao.animal_id
                  and ai.datetime > ao.datetime)
 order by ai.datetime;