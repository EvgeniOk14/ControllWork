package Exceptions;

public class NotRightDataInputExeption extends Exception
{
    public NotRightDataInputExeption(String message)
    {
        super("Вы ввели неверный формат даты! ");
    }
}