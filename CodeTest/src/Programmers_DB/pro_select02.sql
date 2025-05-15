select h.flavor AS FLAVOR
  from first_half h
  join icecream_info i
    on h.flavor = i.flavor
 where h.total_order > 3000
   and i.ingredient_type = 'fruit_based';