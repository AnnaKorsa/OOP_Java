package HW5;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);

        presenter.buttonClick();
        presenter.buttonClick();
        presenter.buttonClick();
        presenter.buttonClick();


    }
}
