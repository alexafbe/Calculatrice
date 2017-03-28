import java.util.Scanner;

public class Moyenne {
	public static void main (String [] args) {
		double valeur_stat;
		int nombre_valeur;
		double somme = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Veuillez saisir le nombre de valeurs");
		nombre_valeur = sc.nextInt(); 
		
		for(int i=1; i <= nombre_valeur; i++) {
			System.out.println ("Veuillez entrer vos valeurs");
			valeur_stat = sc.nextDouble();
			somme = somme + valeur_stat;
			}
		double valeur_moyenne = somme/nombre_valeur;
		System.out.println("La moyenne de vos valeurs est :"+valeur_moyenne);
	    
	}
}
