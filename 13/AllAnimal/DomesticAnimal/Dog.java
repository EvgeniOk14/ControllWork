package AllAnimal.DomesticAnimal;

import AllAnimal.ComandAnimal;
import java.util.ArrayList;

public class Dog extends DomesticAnimal implements ComandAnimal {
    private ArrayList<String> listOfCmand;

    @Override
    public String commandAnimal() {

        System.out.println("Команда собаки: " + listOfCmand);
        return listOfCmand.toString();
    }
}

