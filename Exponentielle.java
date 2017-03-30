package Calculatrice;

import java.util.Scanner;

public class Exponentielle {
	public static void Exponentielle(){
		float Exponentielle1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un chiffre ou un nombre: ");
		Exponentielle1 = sc.nextFloat();
		System.out.println("Sa valeur exponentielle est de: " +Math.exp(Exponentielle1));
		
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
			Exponentielle exponentielle = new Exponentielle();
			exponentielle.Exponentielle();
		}
		if (val == 2){
			
			
		}
		if (val == 3){
			System.exit(0);
			
		}
	
	}
}
