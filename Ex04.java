import java.util.Scanner;

public class Ex04 {
	
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
		int[] numero = new int[10];
	    String[] nome = new String[10];
			
		for (int i = 0; i < 10; i++) {
			 System.out.println("Digite o nome "+(i+1)+"º : ");
	    	 nome[i] = leitor.next();
			 System.out.println("Digite a Idade " + (i+1) + " : ");
			 numero[i] = leitor.nextInt();
		}
		
	
		
		for (int i = 1; i < numero.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (numero[i] > numero[j]) {
		            int temp = numero[i];
		            numero[i] = numero[j];
		            numero[j] = temp;
		            
		            String temp2 = nome[i];
		            nome[i] = nome[j];
		            nome[j] = temp2;
		        }
		    }
		}
	
				
		for (int i = 0; i < 10; i++) {
			System.out.printf("Nome "+ nome[i] +" -- Idade: "+ numero[i] + "");
			System.out.printf("\n");		
		}
 	   

    }
   
}
