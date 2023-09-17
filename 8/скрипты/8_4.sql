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