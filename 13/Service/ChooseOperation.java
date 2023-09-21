package Service;

import AllAnimal.Animal;
import Exceptions.NotDigitalExeption;
import Exceptions.NotRightTypeException;

import java.util.ArrayList;

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
    public void chooseOperation(int operationNumber) throws NotRightTypeException, NotDigitalExeption {

        while(work)
        {
            switch(operationNumber)
            {
                case 1:
                    System.out.println("Вы выбрали операцию " + operationNumber + " Завести новое животное: \n");

                    InputTypeOfAnimal inputTypeOfAnimal = new InputTypeOfAnimal();
                    String typeOfAnimal = inputTypeOfAnimal.inputAnimal();
                    try {
                        CheckTypeOfAnimal checkTypeOfAnimal = new CheckTypeOfAnimal(listOfAnimal);
                        checkTypeOfAnimal.checkTypeOfAnimal(typeOfAnimal);
                    }
                    catch (NotRightTypeException e)
                    {
                        System.out.println("ошибка ввода: " + e.getMessage());

                        ChooseOperation chooseOperation = new ChooseOperation(listOfAnimal);
                        chooseOperation.chooseOperation(operationNumber);
                    }


                    break;

                case 2:
                    System.out.println("Вы выбрали операцию " + operationNumber + " Определить животное в правильный класс: \n");
                    exit();
                    break;

                case 3:
                    System.out.println("Вы выбрали операцию " + operationNumber + "  Вывести список команд, которое выполняет животное: \n");
                    exit();
                    break;

                case 4:
                    System.out.println("Вы выбрали операцию " + operationNumber + " Обучить животное новым командам: \n");
                    exit();
                    break;

                case 5:
                    System.out.println("Вы выбрали операцию " + operationNumber + " (Выход): \n");
                    exit();
                    break;
                default:
                    System.out.println("Ошибка ввода, Вы ввели неправильные данные! ");
                    break;
            }

        }
    }
}
