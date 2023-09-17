use Друзья_человека;
CREATE TABLE domesticAnimals(
id INT AUTO_INCREMENT PRIMARY KEY,
name_type_of_domesticAnimal varchar(30) NOT NULL,
type_animal_id int NOT NULL,
FOREIGN KEY(type_animal_id) REFERENCES animals(id) ON DELETE CASCADE ON UPDATE CASCADE,
INDEX(id)
);

SELECT * FROM domesticAnimals;

INSERT INTO domesticAnimals(name_type_of_domesticAnimal, type_animal_id)
VALUES
("cat", "1"),
("dog", "1"),
("humster", "1");

SELECT * FROM domesticAnimals;