package Service;

import AllAnimal.Animal;

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
        listOfAnimal.add(animal);
        System.out.println("Список животных обнавлён: " + listOfAnimal);
        System.out.println();
    }

}
