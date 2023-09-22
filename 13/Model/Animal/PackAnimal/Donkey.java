package Model.Animal.PackAnimal;

import Model.Animal.ComandAnimal;
import java.util.ArrayList;

public class Donkey extends PackAnimal implements ComandAnimal {
    private ArrayList<String> AnimallistOfCmand;


    @Override
    public String commandAnimal() {

        System.out.println("Команда осла: " + AnimallistOfCmand);
        return AnimallistOfCmand.toString();
    }
}

