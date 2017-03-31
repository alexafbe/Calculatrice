package Calculatrice;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.javafx.scene.control.behavior.ScrollBarBehavior;

public class Salaire {
	public static void Salaire(){
		double Salaire_Annuel_Brut = 0;
		double Salaire_Temporaire = 0;
		double Salaire_Annuel_Net;
		double Salaire_Mensuel_Net;
		double Salaire_Journalier_Net;
		double Salaire_Horaire_Net;
		int Salaire_Pourcentage = 0;
		int Nb_Mois = 0;
		int Nb_Jours = 0;
		int Nb_Hours = 0;
		boolean isnumber;
		do { isnumber = true;
		System.out.println("Veuillez saisir le salaire annuel brut:");
		Scanner fcb = new Scanner (System.in);
		try {
			Salaire_Annuel_Brut = fcb.nextDouble();
		} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
		} while (isnumber != true);
		while (Salaire_Annuel_Brut <0) {
			System.out.println("Un salaire ne peut pas etre negatif !");
			do { isnumber = true;
			System.out.println("Veuillez saisir le salaire annuel brut:");
			Scanner fcb = new Scanner (System.in);
			try {
				Salaire_Annuel_Brut = fcb.nextDouble();
			} catch (InputMismatchException e)
			{
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
			} while (isnumber != true);
		}
		do { isnumber = true;
		System.out.println("Veuillez saisir le pourcentage (23%,25%,45% ou 50% en fonction de votre statut):");
		Scanner fcb = new Scanner (System.in);
		try {
			Salaire_Pourcentage = fcb.nextInt();
		} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
		} while (isnumber != true);
		
		do { isnumber = true;
		System.out.println("Veuillez saisir le Nombre de Mois Travailles:");
		Scanner fcb = new Scanner (System.in);
		try {
			Nb_Mois = fcb.nextInt();
		} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
		} while (isnumber != true);
		while (Nb_Mois > 15 || Nb_Mois < 0){
			System.out.println("La valeur n'est pas valide !");
			do { isnumber = true;
			System.out.println("Veuillez saisir le Nombre de Mois Travailles:");
			Scanner fcb = new Scanner (System.in);
			try {
				Nb_Mois = fcb.nextInt();
			} catch (InputMismatchException e)
			{
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
			} while (isnumber != true);
		}
		do { isnumber = true;
		System.out.println("Veuillez saisir le Nombre de Jours Travailles par Mois:");
		Scanner fcb = new Scanner (System.in);
		try {
			Nb_Jours = fcb.nextInt();
		} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
		} while (isnumber != true);
		while (Nb_Jours > 31 || Nb_Jours < 0){
			System.out.println("La valeur n'est pas bonne !");
			do { isnumber = true;
			System.out.println("Veuillez saisir le Nombre de Jours Travailles par Mois:");
			Scanner fcb = new Scanner (System.in);
			try {
				Nb_Jours = fcb.nextInt();
			} catch (InputMismatchException e)
			{
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
			} while (isnumber != true);
		}
		do { isnumber = true;
		System.out.println("Veuillez saisir le Nombre d'Heures Travailles par Jours:");
		Scanner fcb = new Scanner (System.in);
		try {
			Nb_Hours = fcb.nextInt();
		} catch (InputMismatchException e)
		{
			System.out.println("Erreur, la valeur saisie n'est pas un nombre");
			isnumber = false;
		}
		} while (isnumber != true);
		while (Nb_Hours > 24 || Nb_Hours < 0){
			System.out.println("Il n'y a pas plus de 24 heures dans une journee !");
			do { isnumber = true;
			System.out.println("Veuillez saisir le Nombre d'Heures Travailles par Jours:");
			Scanner fcb = new Scanner (System.in);
			try {
				Nb_Hours = fcb.nextInt();
			} catch (InputMismatchException e)
			{
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
			} while (isnumber != true);
		}
		
		Salaire_Temporaire = Salaire_Annuel_Brut / 100 * Salaire_Pourcentage;
		Salaire_Annuel_Net = Salaire_Annuel_Brut - Salaire_Temporaire;
		System.out.println("Voici votre salaire Annuel Net :"+ Salaire_Annuel_Net);
		
		Salaire_Mensuel_Net = Salaire_Annuel_Net / Nb_Mois;
		System.out.println("Voici votre salaire Mensuel Net :"+ Salaire_Mensuel_Net);
					
		Salaire_Journalier_Net = Salaire_Mensuel_Net / Nb_Jours;
		System.out.println("Voici votre salaire Journalier Net :"+ Salaire_Journalier_Net);
		
		Salaire_Horaire_Net = Salaire_Journalier_Net / Nb_Hours;
		System.out.println("Voici votre salaire Horaire Net :"+ Salaire_Horaire_Net);
		
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
			Salaire salaire = new Salaire();
			salaire.Salaire();
		}
		if (val == 2){
			
			//ADEMANDER
			
		}
		if (val == 3){
			System.exit(0);
			
		}
	}
}
