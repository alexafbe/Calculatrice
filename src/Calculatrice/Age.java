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
		int age;
		// int
		Scanner sc = new Scanner(System.in);
		// do{
		System.out.println("veuillez saisir votre jour de naissance:");
		jour_naissance = sc.nextInt();
		System.out.println("veuillez saisir votre mois de naissance:");
		mois_naissance = sc.nextInt();
		System.out.println("veuillez saisir votre ann�e de naissance:");
		annee_naissance = sc.nextInt();
		System.out.println("veuillez saisir le jour actuel:");
		jour_actuel = sc.nextInt();
		System.out.println("veuillez saisir le mois actuel:");
		mois_actuel = sc.nextInt();
		System.out.println("veuillez saisir l'ann�e actuel");
		annee_actuel = sc.nextInt();
		if (annee_actuel < annee_naissance) {
			System.out.println("erreur age negatif");
		} else {
		}
		age = annee_actuel - annee_naissance;
		if (mois_actuel < mois_naissance) {
			age = age - 1;
		}
		if ((mois_actuel == mois_naissance) && (jour_naissance > jour_actuel)) {
			age = age - 1;
		}
		System.out.println("age =" + age);
		// }while( )
	}
}