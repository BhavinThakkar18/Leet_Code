# Write your MySQL query statement below
SELECT employee_id,
IF(employee_id mod 2 <> 0 and name not like 'M%',salary,0) AS bonus
FROM Employees
ORDER BY employee_id
