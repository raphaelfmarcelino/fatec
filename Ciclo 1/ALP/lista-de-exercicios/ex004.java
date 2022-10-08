import javax.swing.JOptionPane;

public class ex004 {
    
    public static void main (String args[]) {

        double numero, numeroFinal;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero para saber seu valor quadrado: "));
    
        numeroFinal = numero * numero;

        JOptionPane.showMessageDialog(null, "O quadrado de " + numero + " e " + numeroFinal);

    }

}
