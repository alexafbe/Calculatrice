package Calculatrice;
import java.util.Scanner;

public class Carre {
	public static void Carre(){
		float Nombre = 0;
		Scanner sc = new Scanner(System.in);
		boolean isnumber;
			do { isnumber = true;
		System.out.println("Veuillez saisir un nombre afin de calculer sa racine carrée :");
		Scanner fcb = new Scanner (System.in);
			try {
		Nombre = fcb.nextInt();
			} catch (InputMismatchException e)
		{
		System.out.println("Erreur, la valeur saisie n'est pas un nombre");
		isnumber = false;
		}
			} while (isnumber != true);
		System.out.println("Sa racine carrée est " +Math.sqrt(Nombre));
		int val;
		Scanner sb = new Scanner(System.in);
		System.out.println("Voulez-vous ?");
		System.out.println("1 : Recommencer ?");
		System.out.println("2 : Retourner au menu ? (Ne fonctionne pas) ");
		System.out.println("3 : Quitter?");
		val = sb.nextInt();
		while(val > 3 || val < 0){
			System.out.println("Cette option n'existe pas!");
			System.out.println("Voulez-vous ?");
			System.out.println("1 : Recommencer ?");
			System.out.println("2 : Retourner au menu ? (Ne fonctionne pas) ");
			System.out.println("3 : Quitter?");
			val = sb.nextInt();
		}
		if (val == 1){
			Carre carre= new Carre();
			carre.Carre();
		}
		if (val == 2){
			
			
		}
		if (val == 3){
			System.exit(0);
			
		}
		
	}
}
