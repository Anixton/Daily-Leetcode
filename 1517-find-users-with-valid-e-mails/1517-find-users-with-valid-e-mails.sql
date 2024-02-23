SELECT * 
FROM Users
WHERE SUBSTRING(mail, 1, 1) REGEXP '[A-Za-z]'
AND SUBSTRING(mail, 2, INSTR(mail, '@') - 2) REGEXP '^[A-Za-z0-9._-]*$'
AND SUBSTRING(mail, INSTR(mail, '@')) = '@leetcode.com';