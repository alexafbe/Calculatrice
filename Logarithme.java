package Calculatrice;

import java.util.Scanner;

public class Logarithme {
	public static void Logarithme(){
		float logarithme1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un chiffre ou un nombre: ");
		logarithme1 = sc.nextFloat();
		while(logarithme1 < 0){
			System.out.println("la base d'un logarithme ne peut pas etre negative");
			System.out.println("Veuillez entrer un chiffre ou un nombre: ");
			logarithme1 = sc.nextFloat();
		}
		System.out.println("La valeur logarithmique de"+" "+ logarithme1 +" " + "est: " +Math.log(logarithme1));
	
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
