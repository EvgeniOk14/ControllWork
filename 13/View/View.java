package View;

import Model.Exceptions.*;
import Presenter.Presenter;

public interface View
{
    public void runProgramm() throws NotDigitalExeption, NotRightDataInputExeption, NotStringExeption, NotRightTypeException, EmptyListExeption;
    public void setPresenter(Presenter presenter);

}

