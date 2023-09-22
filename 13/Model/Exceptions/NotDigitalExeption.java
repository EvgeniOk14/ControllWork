package Model.Exceptions;

public class NotDigitalExeption extends Exception
{

    public  NotDigitalExeption(String message)
    {
        super("Вы ввели не число! Ведите правильный номер операции из меню! ");
    }
}