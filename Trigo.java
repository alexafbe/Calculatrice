package Calculatrice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Trigo {
	public static void Trigo () {
		float angle_degre = 0;
		Scanner sc = new Scanner (System.in);
		
		boolean isnumber;
			do { isnumber = true;
				System.out.println("Saisissez la valeur de votre angle en degres");
				Scanner fcb = new Scanner (System.in);
			try {
				angle_degre = fcb.nextFloat();
			} catch (InputMismatchException e)
				{
					System.out.println("Erreur, la valeur saisie n'est pas un nombre");
					isnumber = false;
				}
			} while (isnumber != true);
			
		double angle_radian = Math.toRadians(angle_degre);
			while (angle_degre > 360){
				System.out.println("Erreur, veuillez saisir un angle inférieur à 360 degres");
				do { isnumber = true;
				System.out.println("Saisissez la valeur de votre angle en degres");
				Scanner fcb = new Scanner (System.in);
			try {
				angle_degre = fcb.nextFloat();
			} catch (InputMismatchException e)
				{
					System.out.println("Erreur, la valeur saisie n'est pas un nombre");
					isnumber = false;
				}
			} while (isnumber != true);
			}
		System.out.println("Valeur de votre angle en radian :"+angle_radian);
		double cos = Math.cos(angle_radian);
		System.out.println("Cosinus :"+cos);
		double sin = Math.sin(angle_radian);
		System.out.println("Sinus :"+sin);
		double tan = Math.tan(angle_radian);
		System.out.println("Tangente :"+tan);
		
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
		Trigo trigo = new Trigo();
		trigo.Trigo();
		}
		if (val == 2){
			//A VOIR
		}
		if (val == 3){
		System.exit(0);
		}
		
	
	}
}

