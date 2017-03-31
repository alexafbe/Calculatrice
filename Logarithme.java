package Calculatrice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Logarithme {
	public static void Logarithme(){
		float logarithme1 = 0;
		boolean isnumber;
		do { isnumber = true;
		System.out.println("Veuillez saisir un nombre :");
		Scanner fcb = new Scanner (System.in);
		try {
		logarithme1 = fcb.nextInt();
		} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
		} while (isnumber != true);
		while(logarithme1 < 0){
			System.out.println("la base d'un logarithme ne peut pas etre negative");
			do { isnumber = true;
			System.out.println("Veuillez saisir un nombre :");
			Scanner fcb = new Scanner (System.in);
			try {
			logarithme1 = fcb.nextInt();
			} catch (InputMismatchException e)
			{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
			}
			} while (isnumber != true);
		}
		System.out.println("La valeur logarithmique de"+" "+ logarithme1 +" " + "est: " +Math.log(logarithme1));
	
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
			Logarithme logarithme = new Logarithme();
			logarithme.Logarithme();
		}
		if (val == 2){
			
			
		}
		if (val == 3){
			System.exit(0);
			
		}
	
	}
}
