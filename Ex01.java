import java.util.Scanner;

public class Ex1 {
	
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
       	 
 	    int n = 6; 
 	    double nota[][] = new double[n][n]; 
 	    int i,i2; 
 	    String[] nome = new String[6];
 	    


 	    for (i=1; i<n; i++) {
 	    	 System.out.println("Digite o nome do aluno n"+(i)+"º : ");
 	    	 nome[i] = sc.next();
 	    	
 		    for (i2=1; i2<3; i2++) {
 		      System.out.printf("Informe a Nota "+i2 + " do Aluno " + nome[i] +" : ");
 		      nota[i][i2] = sc.nextDouble();
 		    }
 	    }
 	    
 	    
 	    for (i=1; i<n; i++) {
  	    	 System.out.printf("\n");
    	     System.out.printf("Nome "+ nome[i]);
	    	 System.out.printf("\n");
 	    	 System.out.printf("A média foi de : "+ (nota[i][1]+nota[i][2])/2 + "");
 	    	 System.out.printf("\n");
 	    	 
 	    	 if( ((nota[i][1]+nota[i][2])/2) >= 7 ) {
 	    		 System.out.printf("Aluno Aprovado");
 	    	 }else {
 	    		System.out.printf("Aluno Reprovado");
 	    	 } 	    	 
 	    	System.out.printf("----------------------------------------");
 	    }

    }
}
