package Service;

import AllAnimal.Animal;
import Exceptions.NotDigitalExeption;
import Exceptions.NotRightDataInputExeption;
import Exceptions.NotRightTypeException;
import Exceptions.NotStringExeption;
import Scanners.ScannerStart;

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
