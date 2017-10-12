import javax.swing.*;
import java.awt.event.ActionListener;

public class CalView  extends JFrame{
    private JTextField firstnumber=new JTextField(10);
    private JLabel label =new JLabel("+");
    private JTextField secondnumber=new JTextField(10);
    private JButton add=new JButton("ADD");
    private JTextField result=new JTextField(10);

    CalView(){
        JPanel panel=new JPanel();
        this.setSize(600,400);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(firstnumber);
        panel.add(label);
        panel.add(secondnumber);
        panel.add(add);
        panel.add(result);

        this.add(panel);

    }

    public int getFirstNumber(){
        return Integer.parseInt(firstnumber.getText());
    }

    public int getSecondNumber(){
        return Integer.parseInt(secondnumber.getText());
    }

    public int getCalculationSolution(){
        return Integer.parseInt(result.getText());
    }

    public void setCalutationValue(int calutationValue) {
        result.setText(String.valueOf(calutationValue));
    }

    public void addCalculationListener(CalculationListener actionListener){
        add.addActionListener(actionListener);
    }

    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this,errorMessage);
    }


}
