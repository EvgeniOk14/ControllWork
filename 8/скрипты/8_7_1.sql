use Друзья_человека;
CREATE TABLE baggageAnimals(
id INT AUTO_INCREMENT PRIMARY KEY,
name_type_of_baggageAnimal varchar(30) NOT NULL,
type_baggageAnimal_id int NOT NULL,
FOREIGN KEY(type_baggageAnimal_id) REFERENCES animals(id) ON DELETE CASCADE ON UPDATE CASCADE,
INDEX(id)
);

SELECT * FROM baggageanimals;

INSERT INTO baggageanimals(name_type_of_baggageAnimal, type_baggageAnimal_id)
VALUES
("horse", "2"),
("donkey", "2"),
("camel", "2");

SELECT * FROM baggageanimals;