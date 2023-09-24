package Model.Exceptions;

public class EmptyListExeption extends Exception
{
    public EmptyListExeption(String message)
    {
        super("Вы не можете удалить животное, так как список животных пустой! ");
    }
}

