import javax.swing.JOptionPane;

public class ex005 {

    public static void main (String args[]){

        double numero;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui o numero do qual voce quer obter a 5 parte: "));

        double numeroFinal;
        numeroFinal = numero / 5;

        JOptionPane.showMessageDialog(null, "A quinta parte de " + numero + " e igual a " + numeroFinal + ".");

    }
    
}
