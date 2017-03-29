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
		System.out.println(tab1[(int) position]);
		}
}


