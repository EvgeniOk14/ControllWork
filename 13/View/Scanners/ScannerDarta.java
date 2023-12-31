package View.Scanners;

import Model.Exceptions.NotDigitalExeption;
import Model.Exceptions.NotRightDataInputExeption;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScannerDarta
{
    public LocalDate scannerData() throws NotDigitalExeption, NotRightDataInputExeption {
            System.out.println("Введите дату рождения в формате yyyy-MM-dd: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.matches("\\d{4}\\-\\d{2}\\-\\d{2}"))
            {
                /*LocalDate dataBirth = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));*/
                LocalDate dataBirth = LocalDate.parse(input);
                return dataBirth;
            }

            else
            {
                throw new NotRightDataInputExeption("Неверный формат даты");
            }

    }
}

