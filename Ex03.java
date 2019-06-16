import java.util.Scanner;

public class Ex02 {
	
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
		int[] numero = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a nota do aluno " + (i+1) + " : ");
			numero[i] = leitor.nextInt();
		}
		numero = ordenarBolha(numero);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(numero[i]);
		}
 	   

    }
    
    public static int[] ordenarBolha(int[] dados) {
		for (int i = 0; i < dados.length - 1; i++) {
			for (int j = i + 1; j < dados.length; j++) {
				if (dados[i] > dados[j]) {
					int aux = dados[j];
					dados[j] = dados[i];
					dados[i] = aux;
				}
			}
		}
		return dados;
	}
}
