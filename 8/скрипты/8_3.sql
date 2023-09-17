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