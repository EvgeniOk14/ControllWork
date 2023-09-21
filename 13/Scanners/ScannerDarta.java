package Scanners;

import Exceptions.NotDigitalExeption;
import Exceptions.NotRightDataInputExeption;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScannerDarta
{
    public LocalDate scannerStart() throws NotDigitalExeption, NotRightDataInputExeption {
            System.out.println("Введите дату рождения в формате yyyy.MM.dd: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.matches("\\d{4}\\-\\d{2}\\-\\d{2}"))
            {
                LocalDate dataBirth = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                return dataBirth;
            }

            else
            {
                throw new NotRightDataInputExeption("Неверный формат даты");
            }

    }
}