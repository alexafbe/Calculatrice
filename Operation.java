import java.util.Scanner;

public class Operation {
	
	public static void main(String[]args ){
		
		String operateur;
		Scanner sc = new Scanner (System.in);
			System.out.println("entrez le nombre a");
			int nombre1 = sc.nextInt();
		do{
			System.out.println("entrez l'opérateur (+,-,*,/ ou =)");
			operateur = sc.next();
			System.out.println("entrez le nombre b");
			int nombre2 = sc.nextInt();
	
			if (operateur.equals("+")){ 
					nombre1 = nombre1+nombre2;
					System.out.println("Ceci est une addition");}
			else if (operateur.equals("-")){
					nombre1 = nombre1-nombre2;
					System.out.println("Ceci est une soustraction");} 
			else if (operateur.equals("*")){
					nombre1 = nombre1*nombre2;
					System.out.println("Ceci est une multiplication");}
			else if (operateur.equals("/")){
					nombre1 = nombre1/nombre2;
					System.out.println("Ceci est une division");}
			System.out.println(nombre1);
		}while(operateur != "=");			
		
		if (operateur.equals("=")){
			System.out.println(nombre1);
		}
	}
}
		

