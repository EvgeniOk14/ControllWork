package Model.Animal.PackAnimal;

import Model.Animal.Animal;
import Model.Animal.ComandAnimal;

import java.util.ArrayList;

public class PackAnimal extends Animal implements ComandAnimal {

    private ArrayList<String> AnimallistOfCmand;
    @Override
    public String commandAnimal() {

        System.out.println("Команда вьючного животного: " + AnimallistOfCmand);
        return AnimallistOfCmand.toString();

    }
}
