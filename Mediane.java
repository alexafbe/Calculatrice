package Calculatrice;

import java.util.Arrays;
import java.util.Scanner;

public class Mediane {
	public static void Mediane(){
	Scanner sc = new Scanner(System.in);
	int n = 0;
		System.out.println("nombre valeur");
		n = sc.nextInt();
	int[] tab1 = new int[n];
		System.out.println("integrer valeur au tableau");
		for(int i = 0; i <= n-1; i++){
			Scanner fcb = new Scanner(System.in);
			System.out.println("valeur " +i);
			int val = fcb.nextInt();
			tab1[i]=val;
			Arrays.sort(tab1);
			
			}
		int mediane;
		mediane = (n - 1)/2;
		System.out.println(mediane);
		}
}


