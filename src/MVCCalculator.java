public class MVCCalculator {
    public static void main(String[] args) {
        CalView theView=new CalView();
        CalModel theModel=new CalModel();
        CalController theController=new CalController(theView,theModel);
        theView.setVisible(true);
    }
}
