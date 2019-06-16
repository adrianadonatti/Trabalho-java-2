import java.util.Scanner;

public class Ex05 {
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String[] produto = new String[10];
		boolean v = false;
		
		for (int i = 0; i < produto.length; i++) {
			System.out.println("Digite o " + (i+1) + "o Produto: ");
			produto[i] = sc.next();
		}
		
		System.out.println("Qual Produto deseja buscar?");
		String n = sc.next();
		
		
		for (int i = 0; i < produto.length; i++) {
			if (produto[i].equals(n)) {
				v = true;
				break;
			}
		}
		
		if (v) {
			System.out.println("Produto encontrado!");
		}
		else {
			System.out.println("Produto não encontrado!");
		}
    }
    
	
   
}
