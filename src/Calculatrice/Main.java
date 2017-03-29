package Calculatrice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int val;
		Scanner sc = new Scanner(System.in);
		System.out.println("1:Calculs Basiques");
		System.out.println("2:Calculs Avancés");
		System.out.println("3:Calcul de la Mediane");
		System.out.println("4:Calcul de l'Age");
		System.out.println("5:Calcul de la Moyenne");
		System.out.println("6:Calcul du Salaire");
		val = sc.nextInt();
		sc.close();
		
		if (val == 1){
			Operation operation = new Operation();
		}
		
		if (val == 2){
			Scanner sr = new Scanner(System.in);
			System.out.println("1:Calcul du Logarithme");
			System.out.println("2:Calcul de la Racine Carrée");
			System.out.println("3:Calcul de l'Exponentielle");
			System.out.println("4:Calcul de la Puissance");
			System.out.println("5:Calculs Trigonometriques");
			val = sr.nextInt();
			sr.close();
			
			if (val == 1){
				
			}
			if (val == 2){
				
			}
			
			if (val == 3){
				
			}
			if (val == 4){
				
			}
			if (val == 5){
				
			}
			
		}
		
		if (val == 3){
			
		}

		if (val == 4){
			
		}
		if (val == 5){
			
		}
		if (val == 6){
			
		}
	}
}
