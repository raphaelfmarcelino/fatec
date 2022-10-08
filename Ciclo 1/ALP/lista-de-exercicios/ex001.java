import javax.swing.JOptionPane;

public class ex001 {
    public static void main (String args []) {

        //declarar variáveis + entradas
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero a ser impresso: "));

        //processamento

        //saída
        JOptionPane.showMessageDialog(null, "O numero digitado foi " + numero);

    }

}
