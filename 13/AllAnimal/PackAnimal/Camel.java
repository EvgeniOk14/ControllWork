package AllAnimal.PackAnimal;

import AllAnimal.ComandAnimal;
import java.util.ArrayList;

public class Camel extends PackAnimal implements ComandAnimal {
    private ArrayList<String> AnimallistOfCmand;


    @Override
    public String commandAnimal() {

        System.out.println("Команда верблюда: " + AnimallistOfCmand);
        return AnimallistOfCmand.toString();
    }
}

