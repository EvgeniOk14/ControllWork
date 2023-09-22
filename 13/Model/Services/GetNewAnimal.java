package Model.Services;

import Model.Animal.Animal;
import Model.Exceptions.NotAddedAnimalExeption;
import org.w3c.dom.css.Counter;

import java.util.ArrayList;

public class GetNewAnimal
{
    private Animal animal;
    private ArrayList<Animal> listOfAnimal;


    public GetNewAnimal(ArrayList<Animal> listOfAnimal, Animal animal)
    {
        this.animal =  animal;
        this.listOfAnimal = listOfAnimal;
    }


    public void getNewAnimal(ArrayList<Animal> listOfAnimal, Animal animal)
    {
        System.out.println();
        /*listOfAnimal.add(animal);*/
        try{
        AnimalRegistry animalRegistry = new AnimalRegistry(listOfAnimal);
        animalRegistry.addAnimal(animal);

        }
        catch (NotAddedAnimalExeption e) {
            System.out.println("ошибка: " + e.getMessage());
        }
        System.out.println("Список животных обнавлён: " + listOfAnimal.toString());
        System.out.println();
    }

}
