package View.Scanners;

import Model.Exceptions.NotDigitalExeption;

import java.util.Scanner;

public class ScannerInt {


    public int scannerStart() throws NotDigitalExeption {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.matches("\\d+"))
        {
            int id = Integer.parseInt(input);
            return id;
        }
        else
        {
            throw new NotDigitalExeption("ошибка ввода! ");
        }
    }
}


