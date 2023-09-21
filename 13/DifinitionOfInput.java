

import AllAnimal.Animal;
import Exceptions.NotRightTypeException;
import Exceptions.NotDigitalExeption;
import Exceptions.NotRightDataInputExeption;

import java.util.ArrayList;

public class DifinitionOfInput
{
    private ArrayList<Animal> listOfAnimal;


    public void checkAnimalLength(String animal) throws NotRightTypeException, NotDigitalExeption, NotRightDataInputExeption {
        if (animal.length() > 20)
        {
            boolean number = false;
            boolean upper = false;
            for (int i = 0; i < animal.length(); i++)
            {
                if (Character.isDigit(animal.charAt(i)))
                {
                    number = true;
                }
                if (Character.isUpperCase(animal.charAt(i)))
                {
                    upper = true;
                }
                if (number && upper)
                {
                    break;
                }
            }
            if (!number)
            {
                throw new NotDigitalExeption("Пароль не содержит ни одного числа!\n ");
            }
            if (!upper)
            {
                throw new NotRightDataInputExeption("Пароль не содержит ни одной заглавной буквы!\n ");
            }
        }
        else
        {
            throw new NotRightTypeException("Длина пароля меньше допустимого!\n ");
        }
        System.out.println("Поздравляю! Вы ввели верный пароль! ");
    }

}




