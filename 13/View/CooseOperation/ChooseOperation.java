package View.CooseOperation;

import Model.Animal.Animal;
import Model.Exceptions.*;
import View.Scanners.ScannerInt;
import Model.Services.CheckTypeOfAnimal;
import View.ConsoleService.InputTypeOfAnimal;
import View.ConsoleService.TeachAnimalNewComand;
import Model.Services.StartProgramm;
import Model.Services.StartProgrammSearchAnimalBy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ChooseOperation
{
    private ArrayList<Animal> listOfAnimal;
    private Animal animal;
    private static boolean work = true;

    public ChooseOperation(ArrayList<Animal> listOfAnimal)
    {
        this.listOfAnimal = listOfAnimal;
    }

    public void exit()
    {
        System.out.println("Вы выбрали в меню пункт (Выход) и Вы вышли из программы!");
        work = false;
    }
    public void chooseOperation(int operationNumber) throws NotRightTypeException, NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, EmptyListExeption {

        while(work == true)
        {
            switch(operationNumber) {
                case 1:
                    System.out.println("Вы выбрали операцию " + operationNumber + " Завести новое животное: \n");

                    InputTypeOfAnimal inputTypeOfAnimal = new InputTypeOfAnimal();
                    String typeOfAnimal = inputTypeOfAnimal.inputAnimal();

                    try {
                        CheckTypeOfAnimal checkTypeOfAnimal = new CheckTypeOfAnimal(listOfAnimal);
                        checkTypeOfAnimal.checkTypeOfAnimal(typeOfAnimal);

                    } catch (NotRightTypeException e) {
                        System.out.println("ошибка ввода: " + e.getMessage());

                        ChooseOperation chooseOperation = new ChooseOperation(listOfAnimal);
                        chooseOperation.chooseOperation(operationNumber);
                    }

                    break;

                case 2:
                    System.out.println("Вы выбрали операцию " + operationNumber + " Обучить животное новой команде: \n");

                    try {
                        TeachAnimalNewComand teachAnimalNewComand = new TeachAnimalNewComand();
                        int id = teachAnimalNewComand.teachAnimalNewComandById();

                        System.out.println("Ведите новую команду для животного с id =" + id);
                        Scanner sc = new Scanner(System.in);
                        String newCommand = sc.nextLine();

                        Iterator<Animal> iterator = listOfAnimal.iterator();
                        while (iterator.hasNext()) {
                            Animal animal = iterator.next();
                            if (animal.getId() == id) {
                                animal.getAnimalListOfComand().add(newCommand);
                                System.out.println("Команда успешно добавлена для животного с id " + id + "\n");
                                System.out.println("Список команд для животного с id " + id + ": " + animal.getAnimalListOfComand() + "\n");
                                System.out.println(animal.toString());
                            }

                        }
                    } catch (NotDigitalExeption e) {
                        System.out.println(e.getMessage());
                    }

                    StartProgramm startProgramm = new StartProgramm(listOfAnimal);
                    startProgramm.startProgramm();
                    break;

                case 3:
                    System.out.println("Вы выбрали операцию " + operationNumber + "  Вывести список всех животных: \n");
                    if (!listOfAnimal.isEmpty()) {
                        System.out.println(listOfAnimal.toString());
                        StartProgramm startProgram3 = new StartProgramm(listOfAnimal);
                        startProgram3.startProgramm();
                        break;
                    }
                    throw new EmptyListExeption("Ошибка: Лист животных путой! ");


                case 4:
                    System.out.println("Вы выбрали операцию " + operationNumber + " Поиск животного: \n");
                    StartProgrammSearchAnimalBy startProgrammSearchAnimalBy = new StartProgrammSearchAnimalBy(listOfAnimal);
                    startProgrammSearchAnimalBy.startProgrammSearchAnimalById();
//
                    break;
                case 5:
                    System.out.println("Вы выбрали операцию " + operationNumber + " Удаление животного из списка: \n");
                    System.out.println("Ведите id животного, подлежащего удалению: ");

                        ScannerInt scannerInt = new ScannerInt();
                        int id = scannerInt.scannerStart();

                        if (!listOfAnimal.isEmpty())
                        {
                            Iterator<Animal> iterator = listOfAnimal.iterator();
                            while (iterator.hasNext())
                            {
                                Animal animal = iterator.next();
                                if (animal.getId() == id)
                                {
                                    listOfAnimal.remove(animal);
                                    System.out.println("Животное с id = " + id + "успешно удалено!\n");
                                    System.out.println("список животных после удаления: \n" + listOfAnimal.toString());
                                    StartProgrammSearchAnimalBy startProgrammSearchAnimalBy5 = new StartProgrammSearchAnimalBy(listOfAnimal);
                                    startProgrammSearchAnimalBy5.startProgrammSearchAnimalById();
                                    break;
                                }
                            }
                        }
                        else
                        {
                            throw new EmptyListExeption("ошибка: пусто список животных!");
                        }



                case 6:
                    System.out.println("Вы выбрали операцию " + operationNumber + " Вывести список команд животного найденного по имени: \n");
                    for (Animal animal : listOfAnimal)
                    {
                        System.out.println(animal.getAnimalListOfComand());
                        System.out.println(animal.toString());
                    }
                    StartProgrammSearchAnimalBy startProgrammSearchAnimalBy6 = new StartProgrammSearchAnimalBy(listOfAnimal);
                    startProgrammSearchAnimalBy6.startProgrammSearchAnimalById();
                    break;

                case 7:
                    System.out.println("Вы выбрали операцию " + operationNumber + " (Выход): \n");
                    exit();
                    break;

                default:
                    System.out.println("Ошибка ввода, Вы ввели неправильные данные! ");
                    /*chooseOperation(operationNumber);*/
                    break;
            }

        }
    }
}
