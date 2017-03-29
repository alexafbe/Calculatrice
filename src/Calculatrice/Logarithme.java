package Calculatrice;

import java.util.Scanner;

public class Logarithme {
	public static void main(String[]args){
		float logarithme;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Veuillez entrer un chiffre ou un nombre: ");
		logarithme = sc.nextFloat();
		System.out.println("La valeur logarithmique de"+" "+ logarithme +" " + "est: " +Math.log(logarithme));
	}
}
