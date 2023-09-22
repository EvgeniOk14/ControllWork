package Model.Exceptions;

public class NotAddedAnimalExeption extends Exception
{

    public NotAddedAnimalExeption(String message)
    {
        super("Животное не добавлено! Проверьте правильность доавления животного! ");
    }
}