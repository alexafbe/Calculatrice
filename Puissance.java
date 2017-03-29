package Calculatrice;

import java.util.Scanner;

public class Puissance {
	public static void Puissance(){
		float cube;
		float puissance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un chiffre ou un nombre: ");
		cube = sc.nextFloat();
		System.out.println("Veuillez indiquer sa puissance d'augmentation: ");
		puissance = sc.nextFloat();
		System.out.println("Sa valeur est de: " +Math.pow(cube,puissance));
	}
	}
