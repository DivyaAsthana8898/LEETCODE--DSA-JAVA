# Write your MySQL query statement below
SELECT
    s.user_id,
 IFNULL(
        ROUND(
            SUM(IF(c.action = 'confirmed', 1, 0)) / COUNT(*),
            2
        ),
        0.00
    ) AS confirmation_rate 
FROM Signups s
LEFT JOIN Confirmations c
ON S.user_Id = c.user_Id
GROUP BY S.user_Id

