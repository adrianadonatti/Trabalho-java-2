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
		
		for (int i = 0; i < numero.length - 1; i++) {
			for (int j = i + 1; j < numero.length; j++) {
				if (numero[i] > numero[j]) {
					int aux = numero[j];
					numero[j] = numero[i];
					numero[i] = aux;
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(numero[i]);
		}
 	   

    }
   
}
