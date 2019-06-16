import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] numero =  new float[10];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite o " + (i+1) + " número: ");
			numero[i] = sc.nextFloat();
		}
		
		System.out.println("Qual número deseja verificar?");
		float x = sc.nextFloat();
		
	
		
		//busca binaria
		int meio;
		int inicio = 0;
		int fim = numero.length - 1;

		while (inicio <= fim) {
			//pegando o meio do array
			meio = (inicio + fim) / 2;
			
			if (x == numero[meio]) {
				System.out.println("Número encontrado!");
				return;
			}
			else if (x < numero[meio]) {
				fim = meio - 1;
			}
			else {
				inicio = meio + 1;
			}
		}
		
		System.out.println("Número não encontrado!");
		
	}
}