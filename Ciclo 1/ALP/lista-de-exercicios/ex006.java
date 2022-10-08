import java.util.Scanner;

public class ex006 {

    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");

        //declaracao e entrada
        Double celsius = sc.nextDouble();

        //processamento (declaracao e conta juntos)
        double fahrenheit = celsius * 9 / 5 + 32;

        //saída
        System.out.println (celsius + " graus celsius correspondem a " + fahrenheit + " graus Fahrenheit");
        sc.close();
    }
    
}