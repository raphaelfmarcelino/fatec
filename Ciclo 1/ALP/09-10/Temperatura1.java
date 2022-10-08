import javax.swing.JOptionPane;

public class Temperatura1 {
    public static void main (String args[]){
        //declarar as variáveis
        double celsius, fahrenheit;
        celsius = Double.parseDouble(JOptionPane.showInputDialog ("Digite a temperatura em graus Celsius: "));

        //processamnto
        fahrenheit = celsius * 9 / 5 + 32;

        //saída
        JOptionPane.showMessageDialog(null, celsius + " graus Celsius correspondem a " + fahrenheit + " graus Fahrenheit");
    }
}