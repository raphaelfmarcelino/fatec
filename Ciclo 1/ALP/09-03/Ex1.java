import java.util.Scanner;
public class Ex1 {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print ("Querido usuário, digite um inteiro: ");
		int n = scanner.nextInt();
		
		System.out.print ("Digite um número com casas deciamis: ");
		double x;
		x = scanner.nextDouble();
		
		System.out.print ("Digite True ou False (V/F): ");
		boolean b = scanner.nextBoolean();
		
		System.out.println("Você digitou " + n + " " + x + "\n" + b);
		
		System.out.println ("Digite seu nome: ");
		String nome = scanner.next();
		System.out.println ("Seu nome é: " + nome); //Digite o nome e sobrenome, o sobrenome será armazenado em buffer.
		
		String sobrenome = scanner.nextLine();
		System.out.print ("Agora o sobrenome: "); //O sobrenome será impresso automaticamente pois já havia sido digitado.
		System.out.println (sobrenome);
		
		scanner.close();
	}
}
