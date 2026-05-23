# Write your MySQL query statement below
select d.name as Department,e.name as Employee, e.salary as Salary 
from department d
join (select name,salary,departmentId, dense_rank() over(partition by departmentId order by salary desc) as rnk from Employee ) e on d.id=e.departmentId where e.rnk<=3;
