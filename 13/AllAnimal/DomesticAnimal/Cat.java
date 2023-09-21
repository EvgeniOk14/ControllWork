package AllAnimal.DomesticAnimal;

import AllAnimal.ComandAnimal;

import java.util.ArrayList;

public class Cat extends DomesticAnimal implements ComandAnimal {
    private ArrayList<String> AnimallistOfCmand;


    @Override
    public String commandAnimal() {

        System.out.println("Команда кота: " + AnimallistOfCmand);
        return AnimallistOfCmand.toString();
    }
}

