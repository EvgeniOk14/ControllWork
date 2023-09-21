package AllAnimal.PackAnimal;

import AllAnimal.Animal;
import AllAnimal.ComandAnimal;

import java.util.ArrayList;

public class PackAnimal extends Animal implements ComandAnimal {

    private ArrayList<String> AnimallistOfCmand;
    @Override
    public String commandAnimal() {

        System.out.println("Команда вьючного животного: " + AnimallistOfCmand);
        return AnimallistOfCmand.toString();

    }
}
