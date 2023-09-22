package Model.Services;

import org.w3c.dom.css.Counter;

public class AddCounter
{
    private int counter;
    public AddCounter(int counter)
    {
        this.counter = counter;
    }
    public int addCounter(int counter)
    {

        System.out.println("счётчик добавления животных равен: " + counter);
        return counter;
    }
}
