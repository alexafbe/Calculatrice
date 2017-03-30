package Calculatrice;

import java.util.Scanner;

import com.sun.javafx.scene.control.behavior.ScrollBarBehavior;

public class Salaire {
	public static void Salaire(){
		double Salaire_Annuel_Brut;
		double Salaire_Temporaire;
		double Salaire_Annuel_Net;
		double Salaire_Mensuel_Net;
		double Salaire_Journalier_Net;
		double Salaire_Horaire_Net;
		int Salaire_Pourcentage;
		int Nb_Mois;
		int Nb_Jours;
		int Nb_Hours;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le salaire annuel brut:");
		Salaire_Annuel_Brut = (double) sc.nextDouble();
		while (Salaire_Annuel_Brut <0) {
			System.out.println("Un salaire ne peut pas etre negatif !");
			System.out.println("Veuillez saisir le salaire annuel brut:");
			Salaire_Annuel_Brut = sc.nextInt();
		}
		System.out.println("Veuillez saisir le pourcentage (23%,25%,45% ou 50% en fonction de votre statut):");
		Salaire_Pourcentage = sc.nextInt();
		while (Salaire_Pourcentage != 23 || Salaire_Pourcentage != 25 || Salaire_Pourcentage != 45 || Salaire_Pourcentage != 50){
			System.out.println("Il n'existe pas d'autre taux de pourcentage de conversion !");
			System.out.println("Veuillez saisir le pourcentage (23%,25%,45% ou 50% en fonction de votre statut):");
			Salaire_Pourcentage = sc.nextInt();
		}
		System.out.println("Veuillez saisir le Nombre de Mois Travailles:");
		Nb_Mois = sc.nextInt();
		while (Nb_Mois > 15 || Nb_Mois < 0){
			System.out.println("La valeur n'est pas bonne !");
			System.out.println("Veuillez saisir le Nombre de Mois Travailles:");
			Nb_Mois = sc.nextInt();
		}
		System.out.println("Veuillez saisir le Nombre de Jours Travailles par Mois:");
		Nb_Jours = sc.nextInt();
		while (Nb_Jours > 31 || Nb_Jours < 0){
			System.out.println("La valeur n'est pas bonne !");
			System.out.println("Veuillez saisir le Nombre de Jours Travailles par Mois:");
			Nb_Jours = sc.nextInt();
		}
		System.out.println("Veuillez saisir le Nombre d'Heures Travailles par Jours:");
		Nb_Hours = sc.nextInt();
		while (Nb_Hours > 24 || Nb_Hours < 0){
			System.out.println("Il n'y a pas plus de 24 heures dans une journee !");
			System.out.println("Veuillez saisir le Nombre d'Heures Travailles par Jours:");
			Nb_Hours = sc.nextInt();
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
