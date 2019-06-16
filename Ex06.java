import java.util.Scanner;

public class Ex06 {
	
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String[] produto = new String[10];
		
		for (int i = 0; i < produto.length; i++) {
			System.out.println("Digite o " + (i+1) + "o Produto: ");
			produto[i] = sc.next();
		}
		
		System.out.println("Qual Produto deseja buscar?");
		String n = sc.next();
		
		boolean resultado = buscaSequencial(produto, n);
		
		if (resultado) {
			System.out.println("Produto encontrado!");
		}
		else {
			System.out.println("Produto não encontrado!");
		}
    }
    
    public static boolean buscaSequencial(String[] vetor, String texto) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(texto)) {
				return true;
			}
		}
		return false;
	}
	
   
}
