import javax.swing.JOptionPane;

public class Quadrado2 {

    public static void main (String args []) {

        double lado;

        lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: "));

        double perimetro = 4 * lado;
        double area = Math.pow (lado, 2);

        JOptionPane.showMessageDialog(null, "O perimetro desse quadrado e igual a: " + perimetro + "E a area e igual a: " + area);
    }
}