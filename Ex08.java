import java.util.Scanner;

public class Ex08 {
	
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String[] modelo = new String[11];
		String[] marca = new String[11];
		double[] valor = new double[11];

		
		for (int i = 1; i < modelo.length; i++) {
			System.out.println("Digite o " + (i) + "o Modelo: ");
			modelo[i] = sc.next();
			
			System.out.println("Digite o " + (i) + "a Marca: ");
			marca[i] = sc.next();

			System.out.println("Digite o " + (i) + "o Valor: ");
			valor[i] = sc.nextDouble();
		}
		
		System.out.println("Qual Modelo deseja buscar?");
		String n = sc.next();
		
		int resultado = buscaSequencial(modelo, n);
		
		if (resultado > 0) {
			System.out.println("Modelo encontrado!");
			System.out.printf("\n");
			System.out.println("Modelo:"+ modelo[resultado]);
			System.out.printf("\n");
			System.out.println("Marca:"+ marca[resultado]);
			System.out.printf("\n");
			System.out.println("Valor:"+ valor[resultado]);
			System.out.printf("\n");
		}
		else {
			System.out.println("Modelo não encontrado!");
		}
    }
    
    public static int buscaSequencial(String[] vetor, String texto) {
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i].equals(texto)) {
  			   return i;
			}			
		}
		return 0;
	}
	
   
}
