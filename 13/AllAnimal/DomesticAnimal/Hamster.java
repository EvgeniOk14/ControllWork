package AllAnimal.DomesticAnimal;

import AllAnimal.ComandAnimal;
import java.util.ArrayList;

public class Hamster extends DomesticAnimal implements ComandAnimal {
    private ArrayList<String> listOfCmand;
    @Override
    public String commandAnimal() {

        System.out.println("Команда кота: " + listOfCmand);
        return listOfCmand.toString();
    }
}
