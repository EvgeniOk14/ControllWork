package Scanners;

import Exceptions.NotDigitalExeption;
import Exceptions.NotStringExeption;

import java.util.Scanner;

public class ScannerString
{
    public String scannerString() throws NotStringExeption
    {
        Scanner scanner = new Scanner(System.in);
        for (char ch : scanner.nextLine().toCharArray())
        {
            if (Character.isLetter(ch))
            {
                String name = scanner.nextLine();
                return name;
            }
            else
            {
                throw new NotStringExeption("ошибка ввода! ");
            }
        }
        return null;
    }
}
