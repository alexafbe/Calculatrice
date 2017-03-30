package Calculatrice;

import java.util.Scanner;

public class Puissance {
	public static void Puissance(){
		float cube;
		float puissance1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un chiffre ou un nombre: ");
		cube = sc.nextFloat();
		System.out.println("Veuillez indiquer sa puissance d'augmentation: ");
		puissance1 = sc.nextFloat();
		while(puissance1 < 0){
			System.out.println("Une puissance ne peut pas etre negative!");
			System.out.println("Veuillez indiquer sa puissance d'augmentation: ");
			puissance1 = sc.nextFloat();
		}
		System.out.println("Sa valeur est de: " +Math.pow(cube,puissance1));
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