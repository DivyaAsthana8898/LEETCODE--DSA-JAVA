# Write your MySQL query statement below


SELECT  p.product_name ,s.price,s.year

FROM Sales s  

LEFT JOIN Product p
#ON s.product_id = p.product_id
USING (Product_id)

