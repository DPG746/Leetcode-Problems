select distinct e1.num as ConsecutiveNums
from Logs e1 
join Logs e2 on e1.id=e2.id-1
join Logs e3 on e1.id=e3.id-2
where e1.num=e2.num
and e2.num=e3.num;
