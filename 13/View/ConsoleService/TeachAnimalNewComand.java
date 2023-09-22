package View.ConsoleService;

import Model.Exceptions.NotDigitalExeption;
import View.Scanners.ScannerInt;

public class TeachAnimalNewComand
{
    public int teachAnimalNewComandById() throws NotDigitalExeption
    {
        System.out.println("Выберите животное по номеру id котрого Вы хотите обучить новой команде ");
        ScannerInt scannerInt = new ScannerInt();
        int id = scannerInt.scannerStart();
        return id;
    }
}
