package Model.Animal;

import Model.Exceptions.NotDigitalExeption;

public interface ComandAnimal {
    public String commandAnimal();

    public Animal createNewAnimal(Animal animal, String typeOfAnimal) throws NotDigitalExeption;

    public String toString();
}

