package Model.Services;

import java.util.ArrayList;
import Model.Animal.Animal;
import Model.Exceptions.NotAddedAnimalExeption;
import org.w3c.dom.css.Counter;


public class AnimalRegistry
{
    private ArrayList<Animal> listOfAnimal;
    private int counter;

    public AnimalRegistry(ArrayList<Animal> listOfAnimal)
    {
       this.listOfAnimal = listOfAnimal;

    }

    public void addAnimal(Animal animal) throws NotAddedAnimalExeption
    {
        if(!(animal == null))
        {
            listOfAnimal.add(animal);
            counter++;
            AddCounter addCounter = new AddCounter(counter);
            counter = addCounter.addCounter(counter);
            System.out.println("Животное добавлено успешно! счетчик добавления животных = " + counter);
        }
        else
        {
            throw new NotAddedAnimalExeption("животное не существует");
        }

    }
}