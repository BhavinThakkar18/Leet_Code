# Write your MySQL query statement bel
UPDATE Salary set sex=(case WHEN sex='f' then 'm'
                        WHEN sex='m' then 'f' end);
            
