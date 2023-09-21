package AllAnimal.DomesticAnimal;

import AllAnimal.Animal;
import AllAnimal.ComandAnimal;

import java.time.LocalDate;
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