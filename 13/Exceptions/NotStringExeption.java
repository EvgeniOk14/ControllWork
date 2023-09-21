package Exceptions;

public class NotStringExeption extends Exception
{
    public  NotStringExeption(String message)
    {
        super("Вы ввели не строку! Ведите правильный номер операции из меню! ");
    }
}
