use Друзья_человека;
CREATE TABLE domestic_pats(
id INT AUTO_INCREMENT PRIMARY KEY,
Name_of_domestic_pat VARCHAR(30) NOT NULL,
BirthDay_of_domestic_pat DATE NOT NULL,
Command_for_domestic_pat VARCHAR(30) NOT NULL,
domestic_pet_type_id INT NOT NULL,
FOREIGN KEY(domestic_pet_type_id) REFERENCES domesticAnimals(id) ON DELETE CASCADE ON UPDATE CASCADE
);

SELECT * FROM domestic_pats;

INSERT INTO domestic_pats(Name_of_domestic_pat, BirthDay_of_domestic_pat, Command_for_domestic_pat, domestic_pet_type_id)
VALUES
("Мурзик", "2021-01-01", "Мяукать", 1),
("Шарик", "2022-03-01", "Лаять", 2),
("Хома", "2023-07-01", "Кушать", 3),
("Мурка", "2020-09-01", "Мяукать", 1),
("Тобик", "2020-05-01", "Лаять", 2),
("Хомка", "2022-10-01", "Кушать", 3),
("Маркиз", "2019-12-01", "Мяукать", 1),
("Бобик", "2018-07-01", "Лаять", 2),
("Хом", "2021-06-01", "Кушать", 3);


SELECT * FROM domestic_pats;