package Calculatrice;
import java.util.Scanner;

public class Carré {
	public static void main(String[]args){
		float Nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez taper un chiffre ou un nombre afin de calculer sa racine");
		Nombre = sc.nextFloat();
		System.out.println("Sa racine carrée est " +Math.sqrt(Nombre));
	}

}