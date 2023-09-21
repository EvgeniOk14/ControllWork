package Service;

import java.util.Scanner;

public class InputTypeOfAnimal
{
    public String inputAnimal()
    {
        System.out.println("Введите название животного: /кот/собака/хомяк/лошадь/осёл/верблюд/");
        Scanner scanner = new Scanner(System. in);
        String typeOfAnimal = scanner.nextLine();
        return typeOfAnimal;
    }
}
