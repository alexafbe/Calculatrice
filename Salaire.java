package Calculatrice;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.javafx.scene.control.behavior.ScrollBarBehavior;

public class Salaire {
	public static void main (String [] args){
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
		System.out.println("Veuillez saisir le pourcentage:");
		Salaire_Pourcentage = sc.nextInt();
		System.out.println("Veuillez saisir le Nombre de Mois Travaillés:");
		Nb_Mois = sc.nextInt();
		System.out.println("Veuillez saisir le Nombre de Jours Travaillés par Mois:");
		Nb_Jours = sc.nextInt();
		System.out.println("Veuillez saisir le Nombre d'Heures Travaillés par Jours:");
		Nb_Hours = sc.nextInt();
		
		Salaire_Temporaire = Salaire_Annuel_Brut / 100 * Salaire_Pourcentage;
		Salaire_Annuel_Net = Salaire_Annuel_Brut - Salaire_Temporaire;
		System.out.println("Voici votre salaire Annuel Net :"+ Salaire_Annuel_Net);
		
		Salaire_Mensuel_Net = Salaire_Annuel_Net / Nb_Mois;
		System.out.println("Voici votre salaire Mensuel Net :"+ Salaire_Mensuel_Net);
					
		Salaire_Journalier_Net = Salaire_Mensuel_Net / Nb_Jours;
		System.out.println("Voici votre salaire Journalier Net :"+ Salaire_Journalier_Net);
		
		Salaire_Horaire_Net = Salaire_Journalier_Net / Nb_Hours;
		System.out.println("Voici votre salaire Horaire Net :"+ Salaire_Horaire_Net);
	}
}
