	import java.util.Scanner;
	
	public class Ex10 {
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			float[] numero =  new float[10];
			
			for (int i = 0; i < numero.length; i++) {
				System.out.println("Digite o " + (i+1) + " número: ");
				numero[i] = sc.nextFloat();
			}
			
			System.out.println("Qual número deseja verificar?");
			float x = sc.nextFloat();
			
			if (buscaBinaria(numero, x))
				System.out.println("Número encontrado!");
			else
				System.out.println("Número não encontrado!");
		}
		
		

		public static boolean buscaBinaria(float[] dados, float busca) {
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