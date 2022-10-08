import java.util.Scanner;

public class Notas {
    public static void main (String args []) {

        //entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas notas: ");
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();
        System.out.print("Nota 4: ");
        double nota4 = sc.nextDouble();

        //processamento
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        //saída
        System.out.println ("Sua media final e = " + media);
        sc.close();
    }
}