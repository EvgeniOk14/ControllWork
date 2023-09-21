package AllAnimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import  AllAnimal.DomesticAnimal.DomesticAnimalTypes;
import AllAnimal.PackAnimal.PackAnimalTypes;
import Exceptions.NotDigitalExeption;
import Exceptions.NotRightDataInputExeption;
import Scanners.ScannerDarta;
import Scanners.ScannerInt;
import Service.*;

public abstract class Animal implements ComandAnimal
{
    private int id;
    private String name;
    private LocalDate dataBirth;
    private String typeOfAnimal;

    private String kindOfAnimal;

    private ArrayList<String> animalListOfComand;


    public Animal(int id,
                  String name,
                  LocalDate dataBirth,
                  String typeOfAnimal,
                  String kindOfAnimal,
                  ArrayList<String> animalListOfComand)

    {
        this.id = id;
        this.name = name;
        this.dataBirth = dataBirth;
        this.typeOfAnimal = typeOfAnimal;
        this.kindOfAnimal = kindOfAnimal;
        this.animalListOfComand = animalListOfComand;

    }

    public Animal(int id, String name, LocalDate dataBirth, String typeOfAnimal, String kindOfAnimal)
    {
        this(id, name, dataBirth, typeOfAnimal, null, null);
    }

    public Animal(int id, String name, LocalDate dataBirth, String typeOfAnimal)
    {
        this(id, name, dataBirth, null, null, null);
    }

    public Animal(int id, String name, LocalDate dataBirth)
    {
        this(id, name, null, null, null, null);
    }
    public Animal(int id, String name)
    {
        this(id, null, null, null, null, null);
    }
    public Animal()
    {
        this(0, null, null, null, null, null);
    }


    public  void setAnimalListOfComand(ArrayList<String> animalListOfComand)
    {
        this.animalListOfComand = animalListOfComand;
    }

    public ArrayList<String> getAnimalListOfComand()
    {
        return animalListOfComand;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setDataBirth(LocalDate dataBirth)
    {
        this.dataBirth = dataBirth;
    }
    public LocalDate getDataBirth()
    {
        return dataBirth;
    }


    public void setTypeOfAnimal(String typeOfAnimal)
        {
            this.typeOfAnimal = typeOfAnimal;
        }
        public String getTypeOfAnimal()
        {
            return typeOfAnimal;
        }


    public void setKindOfAnimal(String kindOfAnimal)
    {
        this.kindOfAnimal = kindOfAnimal;
    }
    public String getKindOfAnimal()
    {
        return kindOfAnimal;
    }




    @Override
    public Animal createNewAnimal(Animal animal, String typeOfAnimal) throws NotDigitalExeption {
        ArrayList<String> animalListOfComand = new ArrayList<>();

        animal.setTypeOfAnimal(typeOfAnimal);

        if (DomesticAnimalTypes.listOfDomesticAnimal.contains(typeOfAnimal))
        {
            String kindOfAnimal = "Домашнее животное";
            animal.setKindOfAnimal(kindOfAnimal);
        }
        if(PackAnimalTypes.listOfPackAnimal.contains(typeOfAnimal))
        {
            String kindOfAnimal = "Вьючное животное";
            animal.setKindOfAnimal(kindOfAnimal);
        }


        System.out.println("Введите id: ");
        try {
            ScannerInt scannerInt = new ScannerInt();
            int id = scannerInt.scannerStart();
            animal.setId(id);
        }
        catch (NotDigitalExeption e)
        {
            System.out.println("ошибка ввода: " + e.getMessage());
            return createNewAnimal(animal, typeOfAnimal);
        }

        System.out.println("Введите имя: ");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();
        animal.setName(name);


        try
        {
            /*Вод и добавление даты рждения*/
            ScannerDarta scannerDarta = new ScannerDarta();
            dataBirth = scannerDarta.scannerData();
            animal.setDataBirth(dataBirth);
        }
        catch (NotRightDataInputExeption e)
        {
            System.out.println("ошибка ввода: " + e.getMessage());
            return createNewAnimal(animal, typeOfAnimal);
        }

        System.out.println("Введите команду для животного: ");
        Scanner sc8 = new Scanner(System.in);
        String command  = sc8.nextLine();
        animalListOfComand.add(command);
        animal.setAnimalListOfComand(animalListOfComand);

        System.out.println();
        System.out.println(animal);
        System.out.println();

        return animal;
    }



    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(" вид животного(дамашнее/вьючное): ").append(kindOfAnimal).append("\n");
        sb.append(" тип животного(коты/собаки/и т.д): ").append(typeOfAnimal).append("\n");
        sb.append(" порядковый номер в списке: ").append(id).append("\n");
        sb.append(" имя животного: ").append(name).append("\n");
        sb.append(" дата рождения животного: ").append(dataBirth).append("\n");
        sb.append(" команда которую знает животное: ").append(animalListOfComand).append("\n");
        return sb.toString();
        }
}
