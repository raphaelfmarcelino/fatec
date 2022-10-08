import javax.swing.JOptionPane;

public class ex003 {
    public static void main (String args[]) {

        int n1, n2, n3, soma;
    
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1o numero a ser somado: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2o numero a ser somado: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3o numero a ser somado: "));

        soma = n1 + n2 + n3;

        JOptionPane.showMessageDialog(null, "A soma dos numeros digitados e " + soma + ".");

    }

}
