/* Question 1 */

/* Question 1 */
SELECT title, length, rating
FROM Movieinfo
ORDER BY length;

/* Question 2 */
SELECT Director
FROM Directinfo
WHERE Director LIKE 'A%'
GROUP BY Director;

/* Question 3 */ 
SELECT title
FROM MovieInfo
WHERE rating = 'G' AND (length >90 OR year = 1990);

/* Question 4 */
SELECT studio, count(*) as NumberOfFilms
FROM Movieinfo
GROUP BY studio
ORDER BY count(*) desc;

/* Question 5 */
SELECT studio, count(*) as NumberOfFilms
FROM Movieinfo
GROUP BY studio
HAVING count(*) = 1
ORDER BY studio;











