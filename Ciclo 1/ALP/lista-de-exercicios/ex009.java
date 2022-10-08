import javax.swing.JOptionPane;

public class ex009 {

    public static void main (String args[]) {

        double celsius, kelvin;

        celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius a ser convertido para graus Kelvin: "));

        kelvin = celsius + 273.15;

        JOptionPane.showMessageDialog(null, "O valor de " + celsius + "C convertido para graus Kelvin e de " + kelvin + " graus Kelvin.");

    }
    
}
