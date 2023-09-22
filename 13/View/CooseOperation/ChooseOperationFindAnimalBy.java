package View.CooseOperation;

import Model.Animal.Animal;
import Model.Exceptions.NotDigitalExeption;
import Model.Exceptions.NotRightDataInputExeption;
import Model.Exceptions.NotRightTypeException;
import Model.Exceptions.NotStringExeption;
import View.Scanners.ScannerDarta;
import View.Scanners.ScannerInt;
import Model.Services.FindAnimal;
import Model.Services.StartProgramm;
import Model.Services.StartProgrammSearchAnimalBy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ChooseOperationFindAnimalBy
{
    private ArrayList<Animal> listOfAnimal;

    private Animal animal;
    private boolean work = true;
    public ChooseOperationFindAnimalBy(ArrayList<Animal> listOfAnimal)
    {
        this.listOfAnimal = listOfAnimal;
    }


    public void exit1()
    {
        System.out.println("Вы выбрали в меню пункт (Выход) и Вы вышли из программы!");
        work = false;
    }
    public void chooseOperationFindAnimalBy(int operationNumber) throws NotRightTypeException, NotDigitalExeption, NotStringExeption, NotRightDataInputExeption {

        while(work == true)
        {
            switch(operationNumber)
            {
                case 1:
                    System.out.println("Вы выбрали операцию " + operationNumber + " Поиск животного по id: \n");
                    System.out.println("Введите id животного: ");
                    try
                    {
                        ScannerInt scannerInt = new ScannerInt();
                        int id = scannerInt.scannerStart();
                        FindAnimal findAnimal = new FindAnimal(listOfAnimal);
                        findAnimal.findAnimalById(id, listOfAnimal);
                    }
                    catch (NotDigitalExeption e)
                    {
                        System.out.println("ошибка ввода: " + e.getMessage());
                        chooseOperationFindAnimalBy(operationNumber);
                    }


                        /*ChooseOperationFindAnimalBy chooseOperationFindAnimalBy = new ChooseOperationFindAnimalBy(listOfAnimal);
                        chooseOperationFindAnimalBy.chooseOperationFindAnimalBy(operationNumber);*/
                        StartProgrammSearchAnimalBy startProgrammSearchAnimalBy = new StartProgrammSearchAnimalBy(listOfAnimal);
                        startProgrammSearchAnimalBy.startProgrammSearchAnimalById();

                    break;

                case 2:
                    System.out.println("Вы выбрали операцию " + operationNumber + " Поиск животного по имени: \n");
                    System.out.println("Введите имя животного: ");

                        Scanner scanner = new Scanner(System.in);
                        String name = scanner.nextLine();
                    try
                    {

                        FindAnimal findAnimal = new FindAnimal(listOfAnimal);
                        findAnimal.findAnimalByName(name, listOfAnimal);
                    }
                    catch (NotRightTypeException e)
                    {
                        System.out.println("ошибка ввода: " + e.getMessage());
                    }

                    StartProgrammSearchAnimalBy startProgrammSearchAnimalBy2 = new StartProgrammSearchAnimalBy(listOfAnimal);
                    startProgrammSearchAnimalBy2.startProgrammSearchAnimalById();
                    break;

                case 3:
                    System.out.println("Вы выбрали операцию " + operationNumber + "  Поиск животного по дате рождения: \n");
                    System.out.println("Введите дату рождения животного: ");
                        try
                        {
                            ScannerDarta scannerDarta = new ScannerDarta();
                            LocalDate dataBirth = scannerDarta.scannerData();


                            FindAnimal findAnimal = new FindAnimal(listOfAnimal);
                            findAnimal.findAnimalByDataBirth(dataBirth, listOfAnimal);
                        }
                        catch (NotRightDataInputExeption e)
                        {
                        System.out.println("ошибка ввода: " + e.getMessage());
                        }

                        StartProgrammSearchAnimalBy startProgrammSearchAnimalBy3 = new StartProgrammSearchAnimalBy(listOfAnimal);
                        startProgrammSearchAnimalBy3.startProgrammSearchAnimalById();

                    break;

                case 4:
                    System.out.println("Вы выбрали операцию " + operationNumber + " Преход в другое меню: \n");
                    StartProgramm startProgramm4 = new StartProgramm(listOfAnimal);
                    startProgramm4.startProgramm();

                    break;

                case 5:
                    System.out.println("Вы выбрали операцию " + operationNumber + " (Выход): \n");
                    exit1();

                    break;

                default:
                    System.out.println("Ошибка ввода, Вы ввели неправильные данные! ");
                    /*chooseOperationFindAnimalBy(operationNumber);*/
                    break;
            }

        }
    }
}
