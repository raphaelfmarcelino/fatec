import java.util.Scanner;

public class AntecessorSucessor {
    
    Scanner scan= new Scanner(System.in);

    //entrada
    System.out.print("Digite um número: ");
    int n = scan.nextInt();
    //processamento
    int antecessor = n-1;
    int sucessor = n+1;
        
    //saída
    System.out.print("Antecessor: "+antecessor);
    System.out.print("\nsucessor: "+sucessor);
}
