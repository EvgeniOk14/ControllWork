package AllAnimal;

import AllAnimal.Animal;
import Exceptions.NotDigitalExeption;

import java.util.ArrayList;

public interface ComandAnimal {
    public String commandAnimal();

    public Animal createNewAnimal(Animal animal, String typeOfAnimal) throws NotDigitalExeption;

    public String toString();
}

