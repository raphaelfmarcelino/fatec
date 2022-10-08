import javax.swing.JOptionPane;

public class ex002 {
    
    public static void main (String args []) {

        //declarar variáveis + entradas
        double numero;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero a ser impresso: "));

        //processamento

        //saída
        JOptionPane.showMessageDialog(null, "O numero digitado foi " + numero);

    }

}
