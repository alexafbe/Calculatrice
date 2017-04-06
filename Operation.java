package Calculatrice;
import java.util.Scanner;
import java.lang.Character;
import java.util.InputMismatchException;

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
		
		int val = 0;
		boolean isnumber1;
		do { isnumber1 = true;
		Scanner sb = new Scanner(System.in);
		System.out.println("Voulez-vous ?");
		System.out.println("1 : Recommencer ?");
		System.out.println("2 : Retourner au menu ? (Ne fonctionne pas) ");
		System.out.println("3 : Quitter?");
		try{
			val = sb.nextInt();
			while(val > 3 || val < 0){
				System.out.println("Cette option n'existe pas!");
				System.out.println("Voulez-vous ?");
				System.out.println("1 : Recommencer ?");
				System.out.println("2 : Retourner au menu ? (Ne fonctionne pas) ");
				System.out.println("3 : Quitter?");
				val = sb.nextInt();
		}
		}catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber1 = false;
		}
		}while (isnumber1 != true);
		if (val == 1){
			Operation operation = new Operation();
			operation.Operation();
		}
		if (val == 2){
			
			
		}
		if (val == 3){
			System.exit(0);	
		}
	}

}

