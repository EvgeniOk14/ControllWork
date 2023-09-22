package Model.Services;

import Model.Animal.Animal;
import Model.Animal.DomesticAnimal.Cat;
import Model.Animal.DomesticAnimal.Dog;
import Model.Animal.DomesticAnimal.Hamster;
import Model.Animal.PackAnimal.Camel;
import Model.Animal.PackAnimal.Donkey;
import Model.Animal.PackAnimal.Horse;
import Model.Exceptions.NotDigitalExeption;
import Model.Exceptions.NotRightDataInputExeption;
import Model.Exceptions.NotRightTypeException;
import Model.Exceptions.NotStringExeption;

import java.util.ArrayList;


public class CheckTypeOfAnimal
{

    private ArrayList<Animal> listOfAnimal;

    public CheckTypeOfAnimal(ArrayList<Animal> listOfAnimal)
    {
        this.listOfAnimal = listOfAnimal;
    }

    public String checkTypeOfAnimal(String typeOfAnimal) throws NotRightTypeException, NotDigitalExeption, NotRightDataInputExeption, NotStringExeption {
            if (typeOfAnimal.equalsIgnoreCase("кот"))
            {
                Animal animal = new Cat();
                Animal cat = animal.createNewAnimal(animal, typeOfAnimal);

                GetNewAnimal getNewAnimal = new GetNewAnimal(listOfAnimal, cat);
                getNewAnimal.getNewAnimal(listOfAnimal, cat);

                StartProgramm startProgramm = new StartProgramm(listOfAnimal);
                startProgramm.startProgramm();
                return null;

            }
            else if (typeOfAnimal.equalsIgnoreCase("собака"))
            {
                Animal animal = new Dog();
                Animal dog = animal.createNewAnimal(animal, typeOfAnimal);

                GetNewAnimal getNewAnimal = new GetNewAnimal(listOfAnimal, dog);
                getNewAnimal.getNewAnimal(listOfAnimal, dog);

                StartProgramm startProgramm = new StartProgramm(listOfAnimal);
                startProgramm.startProgramm();
                return null;

            }
            else if (typeOfAnimal.equalsIgnoreCase("хомяк"))
            {
                Animal animal = new Hamster();
                Animal humster = animal.createNewAnimal(animal, typeOfAnimal);

                GetNewAnimal getNewAnimal = new GetNewAnimal(listOfAnimal, humster);
                getNewAnimal.getNewAnimal(listOfAnimal, humster);

                StartProgramm startProgramm = new StartProgramm(listOfAnimal);
                startProgramm.startProgramm();
                return null;

            }
            else if (typeOfAnimal.equalsIgnoreCase("лошадь"))
            {
                Animal animal = new Horse();
                Animal horse = animal.createNewAnimal(animal, typeOfAnimal);

                GetNewAnimal getNewAnimal = new GetNewAnimal(listOfAnimal, horse);
                getNewAnimal.getNewAnimal(listOfAnimal, horse);

                StartProgramm startProgramm = new StartProgramm(listOfAnimal);
                startProgramm.startProgramm();
                return null;

            }
            else if (typeOfAnimal.equalsIgnoreCase("осёл"))
            {
                Animal animal = new Donkey();
                Animal donkey = animal.createNewAnimal(animal, typeOfAnimal);

                GetNewAnimal getNewAnimal = new GetNewAnimal(listOfAnimal, donkey);
                getNewAnimal.getNewAnimal(listOfAnimal, donkey);

                StartProgramm startProgramm = new StartProgramm(listOfAnimal);
                startProgramm.startProgramm();
                return null;
            }
            else if (typeOfAnimal.equalsIgnoreCase("верблюд"))
            {
                Animal animal = new Camel();
                Animal camel = animal.createNewAnimal(animal, typeOfAnimal);

                GetNewAnimal getNewAnimal = new GetNewAnimal(listOfAnimal, camel);
                getNewAnimal.getNewAnimal(listOfAnimal, camel);

                StartProgramm startProgramm = new StartProgramm(listOfAnimal);
                startProgramm.startProgramm();
            }


            else
            {
                throw new NotRightTypeException("Ошибка ввода!");
            }
        return null;
    }

}
