package Service;

import AllAnimal.Animal;
import Exceptions.NotDigitalExeption;
import Exceptions.NotRightDataInputExeption;
import Exceptions.NotRightTypeException;
import Exceptions.NotStringExeption;
import Scanners.ScannerStart;

import java.util.ArrayList;
import java.util.Scanner;

public class StartProgrammSearchAnimalBy
{
    private ArrayList<Animal> listOfAnimal;

    public StartProgrammSearchAnimalBy(ArrayList<Animal> listOfAnimal)
    {
        this.listOfAnimal = listOfAnimal;
    }
    public void startProgrammSearchAnimalById() throws NotRightTypeException, NotDigitalExeption, NotRightDataInputExeption, NotStringExeption {
        TabloSearchAnimalBy tabloSearchAnimalBy = new TabloSearchAnimalBy();
        tabloSearchAnimalBy.tabloSearchAnimalBy();

        ScannerStart scannerStart = new ScannerStart();
        Scanner scanner = scannerStart.scannerStart();

        ReadConsoleNumber readConsoleNumber = new ReadConsoleNumber();
        int number = readConsoleNumber.readConsoleNumber(scanner);

        ChooseOperationFindAnimalBy chooseOperationFindAnimalBy = new ChooseOperationFindAnimalBy(listOfAnimal);
        chooseOperationFindAnimalBy.chooseOperationFindAnimalBy(number);

    }
}


