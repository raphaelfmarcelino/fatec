import javax.swing.JOptionPane;

public class ex010 {

    public static void main (String args[]) {

        double velKm, velM;

        velKm = Double.parseDouble(JOptionPane.showInputDialog("Digite uma velocidade em km/h a ser convertida em m/s: "));

        velM = velKm / 3.6;

        JOptionPane.showMessageDialog(null, velKm + "k/m convertidos em m/s corresponde a " + velM + "m/s");

    }
    
}
