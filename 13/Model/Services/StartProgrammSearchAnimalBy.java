package Model.Services;

import Model.Animal.Animal;
import Model.Exceptions.*;
import View.Scanners.ScannerStart;
import View.ConsoleService.ReadConsoleNumber;
import View.CooseOperation.ChooseOperationFindAnimalBy;
import View.Menu.TabloSearchAnimalBy;

import java.util.ArrayList;
import java.util.Scanner;

public class StartProgrammSearchAnimalBy
{
    private ArrayList<Animal> listOfAnimal;

    public StartProgrammSearchAnimalBy(ArrayList<Animal> listOfAnimal)
    {
        this.listOfAnimal = listOfAnimal;
    }
    public void startProgrammSearchAnimalById() throws NotRightTypeException, NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, EmptyListExeption {

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


