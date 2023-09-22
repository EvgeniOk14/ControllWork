package View.ConsoleService;

import java.util.Scanner;

public class ReadConsoleNumber
{
    public int readConsoleNumber(Scanner scanner)
    {

        if(scanner.hasNextInt())
        {
            int number = scanner.nextInt();
            return number;
        }
        else {
            System.out.println("Вы ввели не число! Повторите ввод и введите число!");
            return readConsoleNumber(scanner);
        }
    }
}


