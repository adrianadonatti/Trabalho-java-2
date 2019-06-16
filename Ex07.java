import java.util.Scanner;

public class Ex07 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numero = new int[10];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite o " + (i+1) + " Código de produto: ");
			numero[i] = sc.nextInt();
		}
		
		System.out.println("Qual Código de produto deseja encontrar?");
		int busca = sc.nextInt();
		
		
		if (buscaBinaria(numero, busca))
			System.out.println("Código de produto encontrado!");
		else
			System.out.println("Código de produto não encontrado!");
	}
	

	public static boolean buscaBinaria(int[] dados, int busca) {
		int meio;
		int inicio = 0;
		int fim = dados.length - 1;
		
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (busca == dados[meio]) {
				return true;
			}
			else if (busca < dados[meio]) {
				fim = meio - 1;
			}
			else {
				inicio = meio + 1;
			}
		}
		return false;
	}
	
	
	
	
	
}