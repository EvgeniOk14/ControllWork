package Model.Services;

import Model.Animal.Animal;
import Model.Exceptions.NotDigitalExeption;
import Model.Exceptions.NotRightDataInputExeption;
import Model.Exceptions.NotRightTypeException;
import Model.Exceptions.NotStringExeption;
import View.Scanners.ScannerStart;
import View.ConsoleService.ReadConsoleNumber;
import View.CooseOperation.ChooseOperation;
import View.Menu.Tablo;

import java.util.ArrayList;
import java.util.Scanner;

public class StartProgramm
{
    private ArrayList<Animal> listOfAnimal;

    public StartProgramm(ArrayList<Animal> listOfAnimal)

    {
        this.listOfAnimal = listOfAnimal;
    }
    public void startProgramm() throws NotRightTypeException, NotDigitalExeption, NotRightDataInputExeption, NotStringExeption {
        Tablo tablo = new Tablo();
        tablo.tablo();

        ScannerStart scannerStart = new ScannerStart();
        Scanner scanner = scannerStart.scannerStart();


        ReadConsoleNumber readConsoleNumber = new ReadConsoleNumber();
        int number = readConsoleNumber.readConsoleNumber(scanner);
        ChooseOperation chooseOperation = new ChooseOperation(listOfAnimal);
        chooseOperation.chooseOperation(number);

    }
}
