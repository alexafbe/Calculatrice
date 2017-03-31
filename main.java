package Calculatrice;

import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
	public static void main(String[] args) {
		int val = 0;
		boolean isnumber;
		do {
			isnumber = true;
			Scanner sc = new Scanner(System.in);
			System.out.println("1:Calculs Basiques");
			System.out.println("2:Calculs Avances");
			System.out.println("3:Calcul de la Mediane");
			System.out.println("4:Calcul de l'Age");
			System.out.println("5:Calcul de la Moyenne");
			System.out.println("6:Calcul du Salaire");
			System.out.println("7:Quitter ?");
			try {
				val = sc.nextInt();
				while (val > 7 || val < 0) {
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
			} catch (InputMismatchException e) {
				System.out.println("Erreur, la valeur saisie n'est pas un nombre");
				isnumber = false;
			}
		} while (isnumber != true);

		if (val == 1) {
			Operation operation = new Operation();
			operation.Operation();
		}

		if (val == 2) {
			int val1 = 0;
			boolean isnumber1;
			do {
				isnumber1 = true;
				Scanner sr = new Scanner(System.in);
				System.out.println("1:Calcul du Logarithme");
				System.out.println("2:Calcul de la Racine Carrée");
				System.out.println("3:Calcul de l'Exponentielle");
				System.out.println("4:Calcul de la Puissance");
				System.out.println("5:Calculs Trigonometriques");
				System.out.println("6:Quitter?");
				try {
					val1 = sr.nextInt();
					while (val1 > 6 || val1 < 0) {
						System.out.println("Cette option n'existe pas !");
						System.out.println("1:Calcul du Logarithme");
						System.out.println("2:Calcul de la Racine Carrée");
						System.out.println("3:Calcul de l'Exponentielle");
						System.out.println("4:Calcul de la Puissance");
						System.out.println("5:Calculs Trigonometriques");
						System.out.println("6:Quitter?");
						val1 = sr.nextInt();
					}
				} catch (InputMismatchException e) {
					System.out.println("Erreur, la valeur saisie n'est pas un nombre");
					isnumber1 = false;
				}
			} while (isnumber1 != true);
			if (val1 == 1) {
				Logarithme logarithme = new Logarithme();
				logarithme.Logarithme();
			}
			if (val1 == 2) {
				Carre carre = new Carre();
				carre.Carre();
			}

			if (val1 == 3) {
				Exponentielle exponentielle = new Exponentielle();
				exponentielle.Exponentielle();
			}
			if (val1 == 4) {
				Puissance puissance = new Puissance();
				puissance.Puissance();
			}
			if (val1 == 5) {
				Trigo trigo = new Trigo();
				trigo.Trigo();
			}
			if (val1 == 6) {
				System.exit(0);
			}
		}

		if (val == 3) {
			Mediane mediane = new Mediane();
			mediane.Mediane();
		}

		if (val == 4) {
			Age age = new Age();
			age.Age();
		}
		if (val == 5) {
			Moyenne moyenne = new Moyenne();
			moyenne.Moyenne();
		}
		if (val == 6) {
			Salaire salaire = new Salaire();
			salaire.Salaire();
		}
		if (val == 7) {
			System.exit(0);
		}

	}
}