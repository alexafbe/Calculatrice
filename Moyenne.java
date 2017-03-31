package Calculatrice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Moyenne {
	public static void Moyenne () {
		double valeur_stat = 0;
		int nombre_valeur = 0;
		double somme = 0;
		Scanner sc = new Scanner (System.in);
		boolean isnumber;
		do { isnumber = true;
		System.out.println("Veuillez saisir le nombre de valeurs");
		Scanner fcb = new Scanner (System.in);
		try {
		nombre_valeur = fcb.nextInt();
		} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
		} while (isnumber != true);
			while (nombre_valeur < 0){
				System.out.println("Erreur, ce nombre ne peut etre negatif");
				do { isnumber = true;
				System.out.println("Veuillez saisir le nombre de valeurs");
				Scanner fcb = new Scanner (System.in);
				try {
				nombre_valeur = fcb.nextInt();
				} catch (InputMismatchException e)
				{
					System.out.println("Erreur, la valeur saisie n'est pas un nombre");
					isnumber = false;
				}
				} while (isnumber != true); }
			
		for(int i=1; i <= nombre_valeur; i++) { 
			do { isnumber = true;
			System.out.println("Veuillez saisir votre valeur");
			Scanner fcb = new Scanner (System.in);
			try {
			valeur_stat = fcb.nextDouble();
			} catch (InputMismatchException e)
			{
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
			} while (isnumber != true);
				somme = somme + valeur_stat; }
		double valeur_moyenne = somme/nombre_valeur;
		System.out.println("La moyenne de vos valeurs est : "+valeur_moyenne);
		
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
		Moyenne moyenne = new Moyenne();
		moyenne.Moyenne();
		}
		if (val == 2){
		}
		if (val == 3){
		System.exit(0);
		}
		
		
	    }
	}


