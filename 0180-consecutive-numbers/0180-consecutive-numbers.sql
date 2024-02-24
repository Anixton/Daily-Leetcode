SELECT DISTINCT f.num as ConsecutiveNums 
FROM Logs f
JOIN Logs s ON f.id=s.id-1 AND f.num=s.num
JOIN Logs t on f.id=t.id-2 AND f.num=t.num;