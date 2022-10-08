import java.util.Scanner;

public class Quadrado1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ler o lado de um quadrado, calcular e mostrar sua área e seu perímetro");
        System.out.print("Informe o valor do lado do quadrado: ");

        double lado = scanner.nextDouble();
        double perimetro = lado * 4;
        double area = Math.pow(lado, 2);

        System.out.print("Valor do lado: " + lado + "\nValor do Perimetro: " + perimetro + "\nValor da Area: " + area);

        scanner.close();
    }

}