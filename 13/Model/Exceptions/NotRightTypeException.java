package Model.Exceptions;

public class NotRightTypeException extends Exception
{
    public NotRightTypeException(String message)
    {
        super("Ошибка ввода!  Введите правильный тип животного!");
    }
}
