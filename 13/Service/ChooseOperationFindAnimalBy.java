package Service;

import AllAnimal.Animal;
import Exceptions.NotDigitalExeption;
import Exceptions.NotRightDataInputExeption;
import Exceptions.NotRightTypeException;
import Exceptions.NotStringExeption;
import Scanners.ScannerDarta;
import Scanners.ScannerInt;
import Scanners.ScannerString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ChooseOperationFindAnimalBy
{
    private ArrayList<Animal> listOfAnimal;

    private Animal animal;
    private static boolean work = true;

    public ChooseOperationFindAnimalBy(ArrayList<Animal> listOfAnimal)
    {
        this.listOfAnimal = listOfAnimal;
    }

    public void exit()
    {
        System.out.println("Вы выбрали в меню пункт (Выход) и Вы вышли из программы!");
        work = false;
    }
    public void chooseOperationFindAnimalBy(int operationNumber) throws NotRightTypeException, NotDigitalExeption, NotStringExeption, NotRightDataInputExeption {

        while(work)
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

                    StartProgrammSearchAnimalBy startProgrammSearchAnimalBy1 = new StartProgrammSearchAnimalBy(listOfAnimal);
                    startProgrammSearchAnimalBy1.startProgrammSearchAnimalById();
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
                    StartProgramm startProgramm = new StartProgramm(listOfAnimal);
                    startProgramm.startProgramm();

                    break;

                case 5:
                    System.out.println("Вы выбрали операцию " + operationNumber + " (Выход): \n");
                    exit();
                    break;
                default:
                    System.out.println("Ошибка ввода, Вы ввели неправильные данные! ");
                    chooseOperationFindAnimalBy(operationNumber);
                    break;
            }

        }
    }
}
