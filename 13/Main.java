

import Model.Animal.Animal;
import Model.Services.CheckTypeOfAnimal;
import Model.Services.FindAnimal;
import Model.Service;
import Presenter.Presenter;
import View.Console;
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
import View.View;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> listOfAnimal = new ArrayList();
        /*StartProgramm startProgramm = new StartProgramm(listOfAnimal);
        startProgramm.startProgramm();*/
        View view = new Console(listOfAnimal);

        StartProgramm startProgramm = new StartProgramm(listOfAnimal);
        StartProgrammSearchAnimalBy startProgrammSearchAnimalBy = new StartProgrammSearchAnimalBy(listOfAnimal);
        InputTypeOfAnimal inputTypeOfAnimal = new InputTypeOfAnimal();
        CheckTypeOfAnimal checkTypeOfAnimal = new CheckTypeOfAnimal(listOfAnimal);
        ChooseOperation chooseOperation = new ChooseOperation(listOfAnimal);
        TeachAnimalNewComand teachAnimalNewComand = new TeachAnimalNewComand();
        ScannerInt scannerInt = new ScannerInt();
        FindAnimal findAnimal = new FindAnimal(listOfAnimal);
        ScannerDarta scannerDarta = new ScannerDarta();
        ScannerStart scannerStart = new ScannerStart();
        ScannerString scannerString = new ScannerString();
        Tablo tablo = new Tablo();
        TabloSearchAnimalBy tabloSearchAnimalBy = new TabloSearchAnimalBy();


        Service service = new Service(startProgramm, startProgrammSearchAnimalBy,
                inputTypeOfAnimal, checkTypeOfAnimal,
                chooseOperation, teachAnimalNewComand,
                scannerInt, findAnimal,
                scannerDarta, scannerStart, scannerString,
                tablo, tabloSearchAnimalBy, listOfAnimal);

        Presenter presenter = new Presenter(view, service, listOfAnimal);
        view.runProgramm();

    }
}
