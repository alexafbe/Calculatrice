package Calculatrice;
import java.util.Scanner;

public class Operation {
	
	public static void Operation(){
		boolean question = true;
		Character ope = new Character(' ');
		String operateur;
		Scanner sc = new Scanner (System.in);
		Scanner sca = new Scanner(System.in);
			System.out.println("Entrez le nombre A");
			int nombre1 = sc.nextInt();
		do{
			System.out.println("Entrez l'operateur (+,-,*,/ ou =)");
			operateur = sc.nextLine();
			ope = sca.next(".").charAt(0); 
			System.out.println("Entrez le nombre B");
			int nombre2 = sc.nextInt();
					
			if (ope == '+'){ 
					nombre1 = nombre1+nombre2;
					System.out.println("Ceci est une addition");}
			else if (ope == '-'){
					nombre1 = nombre1-nombre2;
					System.out.println("Ceci est une soustraction");} 
			else if (ope == '*'){
					nombre1 = nombre1*nombre2;
					System.out.println("Ceci est une multiplication");}
			else if (ope == '/'){
					nombre1 = nombre1/nombre2;
					System.out.println("Ceci est une division");}
			else if(ope.compareTo('=') == 0){
				
					question = false;
					System.out.println("toto");
			}
			
			else 
				System.out.println("ERREUR");
			System.out.println(nombre1);
			
		}while(question);			
		
		
		
	}

}
		

