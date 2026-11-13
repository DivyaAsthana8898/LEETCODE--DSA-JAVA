# Write your MySQL query statement below
-- SELECT * ,
-- IF(x+y > z AND x+z > y AND y+z > x ,"YES" ,"NO") AS triangle

-- FROM Triangle


SELECT
    x,
    y,
    z,
    IF(
        x + y > z AND
        x + z > y AND
        y + z > x,
        'Yes',
        'No'
    ) AS triangle
FROM Triangle;