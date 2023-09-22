package View;

import Model.Animal.Animal;
import Model.Exceptions.NotDigitalExeption;
import Model.Exceptions.NotRightDataInputExeption;
import Model.Exceptions.NotRightTypeException;
import Model.Exceptions.NotStringExeption;
import Presenter.Presenter;
import Model.Services.StartProgramm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Console implements View
{
    static Scanner scanner;
    private Presenter presenter;
    private ArrayList<Animal> listOfAnimal;

    public Console(ArrayList<Animal> listOfAnimal)
    {
        this.listOfAnimal = listOfAnimal;
    }




    @Override
    public void runProgramm() throws NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, NotRightTypeException {
        /*StartProgramm startProgramm = new StartProgramm(listOfAnimal);
        startProgramm.startProgramm();*/
        ConsoleStartProgramm(listOfAnimal);
    }

    @Override
    public void setPresenter(Presenter presenter)
    {
        this.presenter = presenter;
    }

    public void ConsoleStartProgramm(ArrayList<Animal> listOfAnimal) throws NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, NotRightTypeException {
        presenter.PresenterStartProgramm(listOfAnimal);
    }
    public  void ConsoleServiceStartProgramm(ArrayList<Animal> listOfAnimal) throws NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, NotRightTypeException {
        presenter.PresenterServiceStartProgramm(listOfAnimal);
    }

    public void ConsoleCheckTypeOfAnimal(String typeOfAnimal) throws NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, NotRightTypeException {

        presenter.PresenterCheckTypeOfAnimal(typeOfAnimal);
    }
    public void ConsoleFindAnimalById(int id, ArrayList<Animal> listOfAnimal)
    {
        presenter.PresenterFindAnimalById(id, listOfAnimal);
    }
    public void ConsoleFindAnimalByName(String name, ArrayList<Animal> listOfAnimal) throws NotRightTypeException {

        presenter.PresenterFindAnimalByName(name, listOfAnimal);
    }

    public void ConsolerFindAnimalByDataBirth(LocalDate dataBirth, ArrayList<Animal> listOfAnimal) throws NotRightTypeException, NotRightDataInputExeption {

        presenter.PresenterFindAnimalByDataBirth(dataBirth, listOfAnimal);
    }

    public void ConsoleGetNewAnimal(ArrayList<Animal> listOfAnimal, Animal animal)
    {
        presenter.PresenterGetNewAnimal(listOfAnimal, animal);
    }


}