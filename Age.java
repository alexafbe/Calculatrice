package Calculatrice;

import java.util.Scanner;

public class Age {
	public static void Age() {
		int date_Actuelle;
		int jour_naissance;
		int mois_naissance;
		int annee_naissance;
		int jour_actuel;
		int mois_actuel;
		int annee_actuel;
		int age1;
		// int
		Scanner sc = new Scanner(System.in);
		// do{
		System.out.println("veuillez saisir votre jour de naissance:");
		jour_naissance = sc.nextInt();
		while (jour_naissance > 31) {
			System.out.println("un mois ne peut etre compose que de 31 jours maximum!");
			System.out.println("veuillez saisir votre jour de naissance:");
			jour_naissance = sc.nextInt();
		}
		System.out.println("veuillez saisir votre mois de naissance: ");
		mois_naissance = sc.nextInt();
		while (mois_naissance > 12) {
			System.out.println("Une annee ne peut être compose que de 12 mois!");
			System.out.println("veuillez saisir votre mois de naissance: ");
			mois_naissance = sc.nextInt();
		}

		System.out.println("veuillez saisir votre annee de naissance:");
		annee_naissance = sc.nextInt();
		System.out.println("veuillez saisir le jour actuel:");
		jour_actuel = sc.nextInt();
		while (jour_actuel > 31){
			System.out.println("un mois ne peut etre compose que de 31 jours maximum!");
			System.out.println("veuillez saisir le jour actuel:");
			jour_actuel = sc.nextInt();
		}
		System.out.println("veuillez saisir le mois actuel:");
		mois_actuel = sc.nextInt();
		while (mois_actuel > 12){
			System.out.println("Une annee ne peut être compose que de 12 mois!");
			System.out.println("veuillez saisir le mois actuel: ");
			mois_actuel = sc.nextInt();
		}
		System.out.println("veuillez saisir l'annee actuel");
		annee_actuel = sc.nextInt();
		while (annee_actuel < annee_naissance) {
			System.out.println("erreur age negatif");
			System.out.println("veuillez saisir l'annee actuel");
			annee_actuel = sc.nextInt();
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
