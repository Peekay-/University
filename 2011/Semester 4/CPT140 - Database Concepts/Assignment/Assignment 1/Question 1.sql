/* Question 1 - Complete */
SELECT title, length, rating
FROM Movieinfo
ORDER BY length;

/* Question 2 - Complete */
SELECT Director
FROM Directinfo
WHERE Director LIKE 'A%'
GROUP BY Director;

/* Question 3 - Complete */ 
SELECT title
from MovieInfo
WHERE rating = 'G' AND (length >=90 OR year = 1990);

/* Question 4 */





