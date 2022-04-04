# Write your MySQL query statement below
SELECT a.name as Employee from Employee a, Employee b
where  a.managerId=b.id
and a.salary > b.salary