package Calculatrice;

import java.util.Scanner;

import Calculatrice.Operation;

public class main {
	public static void main(String[] args){
		int val;
		Scanner sc = new Scanner(System.in);
		System.out.println("1:Calculs Basiques");
		System.out.println("2:Calculs Avancés");
		System.out.println("3:Calcul de la Mediane");
		System.out.println("4:Calcul de l'Age");
		System.out.println("5:Calcul de la Moyenne");
		System.out.println("6:Calcul du Salaire");
		System.out.println("7:Quitter?");
		val = sc.nextInt();
		while (val > 7 || val < 0){
			System.out.println("Cette option n'existe pas !");
			System.out.println("1:Calculs Basiques");
			System.out.println("2:Calculs Avancés");
			System.out.println("3:Calcul de la Mediane");
			System.out.println("4:Calcul de l'Age");
			System.out.println("5:Calcul de la Moyenne");
			System.out.println("6:Calcul du Salaire");
			System.out.println("7:Quitter?");
			val = sc.nextInt();
		}
		if (val == 1){
			Operation operation = new Operation();
			operation.Operation();
		}
		
		if (val == 2){
			int val1;
			Scanner sr = new Scanner(System.in);
			System.out.println("1:Calcul du Logarithme");
			System.out.println("2:Calcul de la Racine Carrée");
			System.out.println("3:Calcul de l'Exponentielle");
			System.out.println("4:Calcul de la Puissance");
			System.out.println("5:Calculs Trigonometriques");
			System.out.println("6:Quitter?");
			val1 = sr.nextInt();
			while (val1 > 6 || val1 < 0){
				System.out.println("Cette option n'existe pas !");
				System.out.println("1:Calcul du Logarithme");
				System.out.println("2:Calcul de la Racine Carrée");
				System.out.println("3:Calcul de l'Exponentielle");
				System.out.println("4:Calcul de la Puissance");
				System.out.println("5:Calculs Trigonometriques");
				System.out.println("6:Quitter?");
				val1 = sr.nextInt();
			
			if (val1 == 1){
				Logarithme logarithme = new Logarithme();
				logarithme.Logarithme();
			}
			if (val1 == 2){
				Carre Carre = new Carre();
				Carre.Carre();
			}
			
			if (val1 == 3){
				Exponentielle exponentielle = new Exponentielle();
				exponentielle.Exponentielle();
			}
			if (val1 == 4){
				Puissance puissance = new Puissance();
				puissance.Puissance();
			}
			if (val1 == 5){
				Trigo trigo = new Trigo();
				trigo.Trigo();
			}
		}
		
		if (val == 3){
			Mediane mediane = new Mediane();
			mediane.Mediane();
		}

		if (val == 4){
			Age age = new Age();
			age.Age();
		}
		if (val == 5){
			Moyenne moyenne = new Moyenne();
			moyenne.Moyenne();
		}
		if (val == 6){
			Salaire salaire = new Salaire();
			salaire.Salaire();
		}
		}
}
}
