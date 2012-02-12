/* Question 4 */

/* Question 1. */
SELECT COUNT (DISTINCT Instname)
FROM Department
WHERE Instname LIKE '%Technology%';

/* Question 2. */
SELECT *
FROM Academic
WHERE AcNum IN (SELECT AcNum
FROM Interest 
GROUP BY AcNum
HAVING count(*) >= 5)
AND EXISTS (SELECT AcNum
FROM Author
GROUP BY AcNum
HAVING count(*) <10);

/* Question 3 */
(SELECT AcNum
FROM Author
GROUP BY AcNum
HAVING count(*) >5)
INTERSECT
(SELECT AcNum
FROM Interest
GROUP BY AcNum
HAVING count(*) >3);

/* Question 4 */
/* 
The SQL query from Question 4 will output the First Name, Last Name and Institution Name of Academics 
who have authored a Paper but have no listed Interests recorded. It also narrows this down further by only including
Academics from the Computer Science department.
It is achieved using three SQL subqueries. The first (IN) reduces the total number of Academics down to those who have 
been listed as an Author in a paper. The second (NOT IN) takes out all the Academics who have an Interest listed.
Finally the last (IN) narrows it down to only those who are in the Computer Science department.
*/

/* Question 5 */
SELECT AcNum
FROM Author
WHERE AcNum NOT LIKE 151
AND PaNum IN 
(SELECT PaNum
FROM Author
WHERE AcNum = 151)
GROUP BY AcNum;



/* Question 6 - Note: The below is not complete/working */
SELECT PaNum
FROM Author, Academic
WHERE PaNum NOT LIKE 151
GROUP BY PaNum
HAVING count(*) >5
AND WHERE AcNum Author.AcNum=Academic.AcNum
GROUP BY AcNum
HAVING count(*) <=1
















