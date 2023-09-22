package View;

import Model.Exceptions.NotDigitalExeption;
import Model.Exceptions.NotRightDataInputExeption;
import Model.Exceptions.NotRightTypeException;
import Model.Exceptions.NotStringExeption;
import Presenter.Presenter;

public interface View
{
    public void runProgramm() throws NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, NotRightTypeException;
    public void setPresenter(Presenter presenter);

}

