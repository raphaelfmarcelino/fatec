import java.util.Scanner;

public class TrintaEDois {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira qualquer valor: ");
        double numero = sc.nextDouble();
        double sucessor = numero+1;
        double antecessor =numero-1;
        double soma = numero*3 + 1 + numero*2-1;
        System.out.println("O sucessor do número " + numero + " é: " + sucessor + "\nE o antecessor do número " + numero + " é: " + antecessor);
        System.out.println("A soma do sucessor de seu triplo mais o antecessor de seu dobro é: " + soma);


        sc.close();
    }
}