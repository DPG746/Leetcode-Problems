SELECT s.id,
CASE
    WHEN s.id%2=1 AND s.id != (SELECT MAX(id) FROM Seat)
        THEN (SELECT student FROM Seat WHERE id = s.id+1)
    WHEN s.id%2=1 AND s.id = (SELECT MAX(id) FROM Seat)
        THEN student                                  
    ELSE (SELECT student FROM Seat WHERE id = s.id-1)   
END AS student
FROM Seat s
ORDER BY s.id;