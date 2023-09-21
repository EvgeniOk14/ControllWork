package AllAnimal.PackAnimal;

import AllAnimal.ComandAnimal;
import java.util.ArrayList;

public class Donkey extends PackAnimal implements ComandAnimal {
    private ArrayList<String> AnimallistOfCmand;


    @Override
    public String commandAnimal() {

        System.out.println("Команда осла: " + AnimallistOfCmand);
        return AnimallistOfCmand.toString();
    }
}

