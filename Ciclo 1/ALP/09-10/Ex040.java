import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex040 {
    public static void main (String args[]){

        //declarar as variáveis
        salario = Double.parseDouble(JOptionPane.showInputDialog ("Insira o valor do salario-base: "));

        //processamnto
        double gratificacao = salario * 0.05;
        double desconto = salario * 0.07;
        double salarioFinal = salario + gratificacao - desconto;

        //saída
        JOptionPane.showMessageDialog(null, "O valor do salario a receber e R$" + salarioFinal);
    }
} 


//https://www.facom.ufu.br/~backes/
//https://www.facom.ufu.br/~backes/wordpress/ListaC01.pdf
//https://docs.oracle.com/javase/8/docs/
//https://replit.com/languages/java10