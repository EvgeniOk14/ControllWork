use Друзья_человека;
CREATE TABLE baggage_pats(
id INT AUTO_INCREMENT PRIMARY KEY,
Name_of_baggage_pat VARCHAR(30) NOT NULL,
BirthDay_of_baggage_pat DATE NOT NULL,
Command_for_baggage_pat VARCHAR(30) NOT NULL,
baggage_pet_type_id INT NOT NULL,
FOREIGN KEY(baggage_pet_type_id) REFERENCES baggageanimals(id) ON DELETE CASCADE ON UPDATE CASCADE
);

SELECT * FROM baggage_pats;

INSERT INTO baggage_pats(Name_of_baggage_pat, BirthDay_of_baggage_pat, Command_for_baggage_pat, baggage_pet_type_id)
VALUES
("Хорс1", "2015-03-01", "Но", 1),
("Иа1", "2016-02-01", "стоять", 2),
("Кемел1", "2017-03-01", "сидеть", 3),
("Хорс2", "2016-04-01", "Бррр", 1),
("Иа2", "2017-05-01", "Не тупить", 2),
("Кемл2", "2018-06-01", "Кушать", 3),
("Хорс3", "2018-07-01", "Мяукать", 1),
("Иа3", "2019-10-01", "Лаять", 2),
("Кемл3", "2020-12-01", "Кушать", 3);


SELECT * FROM baggage_pats;