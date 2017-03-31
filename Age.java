package Calculatrice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Age {
	public static void Age() {
		int date_Actuelle;
		int jour_naissance = 0;
		int mois_naissance = 0;
		int annee_naissance = 0;
		int jour_actuel = 0;
		int mois_actuel = 0;
		int annee_actuel = 0;
		int age1;
		// int
		Scanner sc = new Scanner(System.in);
		// do{
		//System.out.println("veuillez saisir votre jour de naissance:");
		boolean isnumber;
		do { isnumber = true;
			System.out.println("Veuillez saisir votre jour de naissance :");
			Scanner fcb = new Scanner (System.in);
		try {
			jour_naissance = fcb.nextInt();
		} catch (InputMismatchException e)
			{
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
		} while (isnumber != true);
		while (jour_naissance > 31) {
			System.out.println("un mois ne peut etre compose que de 31 jours maximum!");
			do { isnumber = true;
			System.out.println("Veuillez saisir votre jour de naissance :");
			Scanner fcb = new Scanner (System.in);
		try {
			jour_naissance = fcb.nextInt();
		} catch (InputMismatchException e)
			{
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
		} while (isnumber != true);
		}
		do { isnumber = true;
		System.out.println("Veuillez saisir votre mois de naissance :");
		Scanner fcb = new Scanner (System.in);
	try {
		mois_naissance = fcb.nextInt();
	} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
	} while (isnumber != true);
		while (mois_naissance > 12) {
			System.out.println("Une annee ne peut être compose que de 12 mois!");
			do { isnumber = true;
			System.out.println("Veuillez saisir votre mois de naissance :");
			Scanner fcb = new Scanner (System.in);
		try {
			mois_naissance = fcb.nextInt();
		} catch (InputMismatchException e)
			{
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
		} while (isnumber != true);
		}

		do { isnumber = true;
		System.out.println("Veuillez saisir votre annee de naissance :");
		Scanner fcb = new Scanner (System.in);
	try {
		annee_naissance = fcb.nextInt();
	} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
	} while (isnumber != true);
		do { isnumber = true;
		System.out.println("Veuillez saisir le jour actuel :");
		Scanner fcb = new Scanner (System.in);
	try {
		jour_actuel = fcb.nextInt();
	} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
	} while (isnumber != true);
		while (jour_actuel > 31){
			System.out.println("un mois ne peut etre compose que de 31 jours maximum!");
			do { isnumber = true;
			System.out.println("Veuillez saisir le jour actuel :");
			Scanner fcb = new Scanner (System.in);
		try {
			jour_actuel = fcb.nextInt();
		} catch (InputMismatchException e)
			{
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
		} while (isnumber != true);
		}
		do { isnumber = true;
		System.out.println("Veuillez saisir le mois actuel :");
		Scanner fcb = new Scanner (System.in);
	try {
		mois_actuel = fcb.nextInt();
	} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
	} while (isnumber != true);
		while (mois_actuel > 12){
			System.out.println("Une annee ne peut être compose que de 12 mois!");
			do { isnumber = true;
			System.out.println("Veuillez saisir le jour actuel :");
			Scanner fcb = new Scanner (System.in);
		try {
			mois_actuel = fcb.nextInt();
		} catch (InputMismatchException e)
			{
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
		} while (isnumber != true);
		}
		do { isnumber = true;
		System.out.println("Veuillez saisir l'annee actuelle :");
		Scanner fcb = new Scanner (System.in);
	try {
		annee_actuel = fcb.nextInt();
	} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
	} while (isnumber != true);
		while (annee_actuel < annee_naissance) {
			System.out.println("erreur, age negatif");
			do { isnumber = true;
			System.out.println("Veuillez saisir l'annee actuelle :");
			Scanner fcb = new Scanner (System.in);
		try {
			annee_actuel = fcb.nextInt();
		} catch (InputMismatchException e)
			{
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
		} while (isnumber != true);
		}
		age1 = annee_actuel - annee_naissance;
		if (mois_actuel < mois_naissance) {
			age1 = age1 - 1;
		}
		if ((mois_actuel == mois_naissance) && (jour_naissance > jour_actuel)) {
			age1 = age1 - 1;
		}
		System.out.println("age =" + age1);
		// }while( )
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
			Age age = new Age();
			age.Age();
		}
		if (val == 2){
			
			
			
		}
		if (val == 3){
			System.exit(0);
			
		}
	}
}
