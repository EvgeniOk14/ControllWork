package Model.Services;

import Model.Animal.Animal;
import Model.Exceptions.NotRightDataInputExeption;
import Model.Exceptions.NotRightTypeException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class FindAnimal
{
    private ArrayList<Animal> listOfAnimal;


    public FindAnimal(ArrayList<Animal> listOfAnimal)
    {
        this.listOfAnimal = listOfAnimal;
    }
    public Animal findAnimalById(int id, ArrayList<Animal> listOfAnimal)
    {
        Iterator<Animal> iterator = listOfAnimal.iterator();
        while (iterator.hasNext())
        {
            Animal animal = iterator.next();
            if (animal.getId() == id)
            {
                System.out.println("Успешно найдено животное с id = " + id + ": \n" + animal.toString());
                return animal;
            }
        }
        return null;
    }


    public Animal findAnimalByName(String name, ArrayList<Animal> listOfAnimal) throws NotRightTypeException {
        Iterator<Animal> iterator = listOfAnimal.iterator();
        while (iterator.hasNext())
        {
            Animal animal = iterator.next();
                if (animal.getName().equalsIgnoreCase(name))
                {
                    System.out.println("Успешно найдено животное с именем = " + name + ": \n" + animal.toString());
                    return animal;
                }
            }
        throw new NotRightTypeException("ошибка ввода: ");
    }

    public Animal findAnimalByDataBirth(LocalDate dataBirth, ArrayList<Animal> listOfAnimal) throws NotRightDataInputExeption {
        Iterator<Animal> iterator = listOfAnimal.iterator();
        while (iterator.hasNext())
        {
            Animal animal = iterator.next();
            if (animal.getDataBirth() == dataBirth)
            {
                System.out.println("Успешно найдено животное с датой рождения = " + dataBirth + ": \n" + animal.toString());
                return animal;
            }
        }
        throw new NotRightDataInputExeption("ошибка ввода: ");
   }
}
