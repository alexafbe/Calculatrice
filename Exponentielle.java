package Calculatrice;

import java.util.Scanner;

public class Exponentielle {
	public static void main(String[]args){
		float Exponentielle;
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez donnée un chiffre ou un nombre: ");
		Exponentielle = sc.nextFloat();
		System.out.println("sa valeur exponentielle est de: " +Math.exp(Exponentielle));
	}
}