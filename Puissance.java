package Calculatrice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Puissance {
	public static void Puissance(){
		float cube = 0;
		float puissance1 = 0;
		boolean isnumber;
		do { isnumber = true;
		System.out.println("Veuillez saisir un nombre :");
		Scanner fcb = new Scanner (System.in);
		try {
		cube = fcb.nextFloat();
		} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
		} while (isnumber != true);
		do { isnumber = true;
		System.out.println("Veuillez indiquer sa puissance d'augmentation: ");
		Scanner fcb = new Scanner (System.in);
		try {
		puissance1 = fcb.nextFloat();
		} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
		} while (isnumber != true);
		while(puissance1 < 0){
			System.out.println("Une puissance ne peut pas etre negative!");
			do { isnumber = true;
			System.out.println("Veuillez indiquer sa puissance d'augmentation: ");
			Scanner fcb = new Scanner (System.in);
			try {
			puissance1 = fcb.nextFloat();
			} catch (InputMismatchException e)
			{
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
			} while (isnumber != true);
		}
		System.out.println("Sa valeur est de: " +Math.pow(cube,puissance1));
		
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
			Puissance puissance = new Puissance();
			puissance.Puissance();
		}
		if (val == 2){
			
			
		}
		if (val == 3){
			System.exit(0);
			
		}
	}
}
