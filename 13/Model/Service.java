package Model;

import Model.Animal.Animal;
import Model.Exceptions.*;
import View.ConsoleService.InputTypeOfAnimal;
import View.ConsoleService.TeachAnimalNewComand;
import View.CooseOperation.ChooseOperation;
import View.Menu.Tablo;
import View.Menu.TabloSearchAnimalBy;
import View.Scanners.ScannerDarta;
import View.Scanners.ScannerInt;
import View.Scanners.ScannerStart;
import View.Scanners.ScannerString;
import Model.Services.StartProgramm;
import Model.Services.StartProgrammSearchAnimalBy;
import Model.Services.CheckTypeOfAnimal;
import Model.Services.FindAnimal;
import Model.Services.GetNewAnimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Service
{
    private CheckTypeOfAnimal checkTypeOfAnimal;
    private FindAnimal findAnimal;
    private GetNewAnimal getNewAnimal;
    private StartProgramm startProgramm;
    private StartProgrammSearchAnimalBy startProgrammSearchAnimalBy;

    private ArrayList<Animal> listOfAnimal;

    public Service(StartProgramm startProgramm, StartProgrammSearchAnimalBy startProgrammSearchAnimalBy,
                   InputTypeOfAnimal inputTypeOfAnimal, CheckTypeOfAnimal checkTypeOfAnimal,
                   ChooseOperation chooseOperation, TeachAnimalNewComand teachAnimalNewComand,
                   ScannerInt scannerInt, FindAnimal findAnimal,
                   ScannerDarta scannerDarta, ScannerStart scannerStart, ScannerString scannerString,
                   Tablo tablo, TabloSearchAnimalBy tabloSearchAnimalBy, ArrayList<Animal> listOfAnimal)
    {
        this.checkTypeOfAnimal = checkTypeOfAnimal;
        this.findAnimal = findAnimal;
        this.getNewAnimal = getNewAnimal;
        this.startProgramm = startProgramm;
        this.startProgrammSearchAnimalBy = startProgrammSearchAnimalBy;
        this.listOfAnimal = listOfAnimal;


    }

    public void ServiceStartProgramm(ArrayList<Animal> listOfAnimal) throws NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, NotRightTypeException, EmptyListExeption {
        StartProgramm startProgramm = new StartProgramm(listOfAnimal);
        startProgramm.startProgramm();
    }

    public void ServiceStartProgrammSearchById(ArrayList<Animal> listOfAnimal) throws NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, NotRightTypeException, EmptyListExeption {
        StartProgrammSearchAnimalBy startProgrammSearchAnimalBy = new StartProgrammSearchAnimalBy(listOfAnimal);
        startProgrammSearchAnimalBy.startProgrammSearchAnimalById();
    }

    public void ServiceCheckTypeOfAnimal(String typeOfAnimal) throws NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, NotRightTypeException, EmptyListExeption {
        CheckTypeOfAnimal checkTypeOfAnimal = new CheckTypeOfAnimal(listOfAnimal);
        checkTypeOfAnimal.checkTypeOfAnimal(typeOfAnimal);
    }
    public void ServiceFindAnimalById(int id, ArrayList<Animal> listOfAnimal)
    {
        FindAnimal findAnimal = new FindAnimal(listOfAnimal);
        findAnimal.findAnimalById(id, listOfAnimal);
    }
    public void ServiceFindAnimalByName(String name, ArrayList<Animal> listOfAnimal) throws NotRightTypeException {
        FindAnimal findAnimal = new FindAnimal(listOfAnimal);
        findAnimal.findAnimalByName(name, listOfAnimal);
    }

    public void ServiceFindAnimalByDataBirth(LocalDate dataBirth, ArrayList<Animal> listOfAnimal) throws NotRightTypeException, NotRightDataInputExeption {
        FindAnimal findAnimal = new FindAnimal(listOfAnimal);
        findAnimal.findAnimalByDataBirth(dataBirth, listOfAnimal);
    }

    public void ServiceGetNewAnimal(ArrayList<Animal> listOfAnimal, Animal animal)
    {
        GetNewAnimal getNewAnimal = new GetNewAnimal(listOfAnimal, animal);
        getNewAnimal.getNewAnimal(listOfAnimal, animal);
    }
}
