import javax.swing.JOptionPane;

public class ex007 {

    public static void main (String args[]) {

        double celsius, fahrenheit;

        fahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor em graus Fahrenheit para ser convertido em graus Celsius: "));

        celsius = 5 * ((fahrenheit - 32)/9);

        JOptionPane.showMessageDialog(null, fahrenheit + " graus Fahrenheit quando convertidos para celsius sao " + celsius + "C.");

    }
    
}
