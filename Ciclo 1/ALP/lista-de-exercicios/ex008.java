import javax.swing.JOptionPane;

public class ex008 {
    public static void main (String args[]) {

       double kelvin, celsius;
       
       kelvin = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em graus Kelvin para converter em Graus Celsius: "));

       celsius = kelvin - 273.15;

       JOptionPane.showMessageDialog(null, "O valor de " + kelvin + " graus Kelvin, em Celsius corresponde a " + celsius + "C.");

    }
    
}
