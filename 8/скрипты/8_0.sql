use Друзья_человека;
CREATE TABLE animals(
id int auto_increment primary key,
type_of_animal varchar(30) NOT NULL,
INDEX(id)
);

SELECT * FROM animals;