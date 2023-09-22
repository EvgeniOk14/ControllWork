package Presenter;
import Model.Animal.Animal;
import Model.Services.CheckTypeOfAnimal;
import Model.Exceptions.NotDigitalExeption;
import Model.Exceptions.NotRightDataInputExeption;
import Model.Exceptions.NotRightTypeException;
import Model.Exceptions.NotStringExeption;
import View.View;
import Model.Service;


import java.time.LocalDate;
import java.util.ArrayList;


public class Presenter {
    private View view;
    private Service service;
    private ArrayList<Animal> listOfAnimal;

    public Presenter(View view, Service service, ArrayList<Animal> listOfAnimal)
    {
        this.view = view;
        this.service = service;
        this.listOfAnimal = listOfAnimal;
        view.setPresenter(this);

    }

    public void PresenterStartProgramm(ArrayList<Animal> listOfAnimal) throws NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, NotRightTypeException {
        service.ServiceStartProgramm(listOfAnimal);
    }
    public  void PresenterServiceStartProgramm(ArrayList<Animal> listOfAnimal) throws NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, NotRightTypeException {
        service.ServiceStartProgrammSearchById(listOfAnimal);
    }

    public void PresenterCheckTypeOfAnimal(String typeOfAnimal) throws NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, NotRightTypeException {

        service.ServiceCheckTypeOfAnimal(typeOfAnimal);
    }
    public void PresenterFindAnimalById(int id, ArrayList<Animal> listOfAnimal)
    {
        service.ServiceFindAnimalById(id, listOfAnimal);
    }
    public void PresenterFindAnimalByName(String name, ArrayList<Animal> listOfAnimal) throws NotRightTypeException {

        service.ServiceFindAnimalByName(name, listOfAnimal);
    }

    public void PresenterFindAnimalByDataBirth(LocalDate dataBirth, ArrayList<Animal> listOfAnimal) throws NotRightTypeException, NotRightDataInputExeption {

        service.ServiceFindAnimalByDataBirth(dataBirth, listOfAnimal);
    }

    public void PresenterGetNewAnimal(ArrayList<Animal> listOfAnimal, Animal animal)
    {
        service.ServiceGetNewAnimal(listOfAnimal, animal);
    }

}