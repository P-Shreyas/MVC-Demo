import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalController {
    CalView theView;
    CalModel theModel;
    CalController(CalView theView,CalModel theModel){
        this.theModel=theModel;
        this.theView=theView;
        this.theView.addCalculationListener(new CalculationListener(this));
    }

}
class CalculationListener implements ActionListener{

    CalController calController;
    CalculationListener(CalController calController){
        this.calController=calController;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            int firstNumber,secondNumber;
            firstNumber=calController.theView.getFirstNumber();
            secondNumber=calController.theView.getSecondNumber();

            calController.theModel.addtwonumbers(firstNumber,secondNumber);
            calController.theView.setCalutationValue(calController.theModel.getCalculationValue());

        }
        catch (Exception e){
            calController.theView.displayErrorMessage(e.toString());
        }
    }
}
