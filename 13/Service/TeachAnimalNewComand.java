package Service;

import Exceptions.NotDigitalExeption;
import Scanners.ScannerInt;
import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class TeachAnimalNewComand
{
    public int teachAnimalNewComandById() throws NotDigitalExeption
    {
        System.out.println("Выберите животное по номеру id котрого Вы хотите обучить новой команде ");
        /*Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        return id;*/
        ScannerInt scannerInt = new ScannerInt();
        int id = scannerInt.scannerStart();
        return id;
    }
}
