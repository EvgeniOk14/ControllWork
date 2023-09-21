

import AllAnimal.Animal;
import Service.StartProgramm;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> listOfAnimal = new ArrayList();

        StartProgramm startProgramm = new StartProgramm(listOfAnimal);
        startProgramm.startProgramm();
    }
}
