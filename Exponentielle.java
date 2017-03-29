package Calculatrice;

import java.util.Scanner;

public class Exponentielle {
	public static void main(String[]args){
		float Exponentielle;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un chiffre ou un nombre: ");
		Exponentielle = sc.nextFloat();
		System.out.println("Sa valeur exponentielle est de: " +Math.exp(Exponentielle));
	}
}
