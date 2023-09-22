package Model.Animal.DomesticAnimal;

import Model.Animal.Animal;
import Model.Animal.ComandAnimal;

import java.util.ArrayList;

public class DomesticAnimal extends Animal implements ComandAnimal
{
    private ArrayList<String> AnimallistOfCmand;

    @Override
    public String commandAnimal()
    {
        System.out.println("Команда домашнего животного: " + AnimallistOfCmand);
        return AnimallistOfCmand.toString();
    }
}