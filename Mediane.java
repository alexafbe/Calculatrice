package Calculatrice;

import java.util.Arrays;
import java.util.Scanner;

public class Mediane {
	public static void Mediane(){
	Scanner sc = new Scanner(System.in);
	int n = 0;
		System.out.println("Entrez le nombre de valeur a remplir dans le tableau");
		n = sc.nextInt();
		while(n < 0){
			System.out.println("Le nombre de case du tableau ne peut pas etre negatif!");
			System.out.println("Entrez le nombre de valeur a remplir dans le tableau");
			n = sc.nextInt();
		}
	int[] tab1 = new int[n];
		System.out.println("Integrer une par une les valeurs");
		Scanner fcb = new Scanner(System.in);
		for(int i = 1; i <= n; i++){
			System.out.println("valeur " +i);
			int val = fcb.nextInt();
			tab1[i-1]=val;
			}
		fcb.close();
		Arrays.sort(tab1);
		System.out.println(Arrays.toString(tab1));
		float position;
		position = (n - 1)/2;
		System.out.println("La mediane est: " +tab1[(int) position]);
		
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
			Mediane mediane= new Mediane();
			mediane.Mediane();
		}
		if (val == 2){
			
			
		}
		if (val == 3){
			System.exit(0);
			
		}
		
		}
}


