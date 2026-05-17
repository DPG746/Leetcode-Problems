# Write your MySQL query statement below
select c.firstName,c.lastName,d.city,d.state from Person c left join Address d on c.personId=d.personId;