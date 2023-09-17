USE Друзья_человека;

CREATE TABLE all_pats (
  id INT AUTO_INCREMENT PRIMARY KEY,
  Name_of_domestic_pat VARCHAR(30) NOT NULL,
  BirthDay_of_domestic_pat DATE NOT NULL,
  Command_for_domestic_pat VARCHAR(30) NOT NULL,
  domestic_pet_type_id INT NOT NULL,
  original_table VARCHAR(30) NOT NULL,
  FOREIGN KEY (domestic_pet_type_id) REFERENCES domesticAnimals(id) ON DELETE CASCADE ON UPDATE CASCADE,
  INDEX (id)
);

INSERT INTO all_pats (Name_of_domestic_pat, BirthDay_of_domestic_pat, Command_for_domestic_pat, domestic_pet_type_id, original_table)
SELECT Name_of_domestic_pat, BirthDay_of_domestic_pat, Command_for_domestic_pat, domestic_pet_type_id, 'domestic_pats' AS original_table
FROM domestic_pats;

INSERT INTO all_pats (Name_of_baggage_pat, BirthDay_of_baggage_pat, Command_for_baggage_pat, baggage_pet_type_id, original_table)
SELECT Name_of_baggage_pat, BirthDay_of_baggage_pat, Command_for_baggage_pat, baggage_pet_type_id, 'baggage_pats' AS original_table
FROM baggage_pats;

INSERT INTO all_pats (Name_of_domestic_pat, BirthDay_of_domestic_pat, Command_for_domestic_pat, domestic_pet_type_id, original_table)
SELECT Name_of_domestic_animal, BirthDay_of_domestic_animal, Command_for_domestic_animal, domestic_animal_type_id, 'new_domestic_animals' AS original_table
FROM new_domestic_animals;

INSERT INTO all_pats (Name_of_domestic_pat, BirthDay_of_domestic_pat, Command_for_domestic_pat, domestic_pet_type_id, original_table)
SELECT Name_of_baggage_animal, BirthDay_of_baggage_animal, Command_for_baggage_animal, domestic_animal_type_id, 'new_baggage_animals' AS original_table
FROM new_baggage_animals;

SELECT * FROM all_pats;