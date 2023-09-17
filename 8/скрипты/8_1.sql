use Друзья_человека;
CREATE TABLE domesticAnimals(
id INT AUTO_INCREMENT PRIMARY KEY,
name_type_of_domesticAnimal varchar(30) NOT NULL,
type_animal_id int NOT NULL,
FOREIGN KEY(type_animal_id) REFERENCES animals(id) ON DELETE CASCADE ON UPDATE CASCADE,
INDEX(id)
);

SELECT * FROM domesticAnimals;