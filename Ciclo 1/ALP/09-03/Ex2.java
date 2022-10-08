import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String [] args) {
        String strAux;
        strAux = JOptionPane.showInputDialog("Digite um inteiro: ");
        int n = Integer.parseInt(strAux);
        JOptionPane.showMessageDialog(null, "Você digitou " + n);
        double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor real", 0.0));
    }
}
