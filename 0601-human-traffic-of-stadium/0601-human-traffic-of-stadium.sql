SELECT id, visit_date, people 
FROM Stadium a
WHERE 
    (a.people >= 100 AND 
    (SELECT people FROM Stadium WHERE id = a.id + 1) >= 100 AND 
    (SELECT people FROM Stadium WHERE id = a.id + 2) >= 100)
OR 
    (a.people >= 100 AND 
    (SELECT people FROM Stadium WHERE id = a.id - 1) >= 100 AND 
    (SELECT people FROM Stadium WHERE id = a.id - 2) >= 100)
OR 
    (a.people >= 100 AND 
    (SELECT people FROM Stadium WHERE id = a.id - 1) >= 100 AND 
    (SELECT people FROM Stadium WHERE id = a.id + 1) >= 100);