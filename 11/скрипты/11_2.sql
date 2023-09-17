use Друзья_человека;

CREATE TEMPORARY TABLE all_animals
SELECT * FROM domestic_pats
UNION SELECT * FROM baggage_pats;

SELECT * FROM all_animals;

CREATE TABLE young_animals
SELECT Name_of_domestic_pat, BirthDay_of_domestic_pat, Command_for_domestic_pat, domestic_pet_type_id,
 TIMESTAMPDIFF(MONTH, BirthDay_of_domestic_pat, CURDATE()) AS age_in_month
FROM all_animals
WHERE BirthDay_of_domestic_pat BETWEEN ADDDATE(CURDATE(), INTERVAL -3 YEAR) AND ADDDATE(CURDATE(), INTERVAL -1 YEAR);

SELECT * FROM  young_animals;