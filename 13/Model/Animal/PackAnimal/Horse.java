package Model.Animal.PackAnimal;

import Model.Animal.ComandAnimal;
import java.util.ArrayList;

public class Horse extends PackAnimal implements ComandAnimal {
    private ArrayList<String> AnimallistOfCmand;


    @Override
    public String commandAnimal() {

        System.out.println("Команда лошади: " + AnimallistOfCmand);
        return AnimallistOfCmand.toString();
    }
}
