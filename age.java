package Calculatrice;

import java.util.Scanner;

public class age {
	public static void main(String[] args){
int date_Actuelle;
int jour_naissance;
int mois_naissance;	
int année_naissance;
int jour_actuel;
int mois_actuel;
int année_actuel;
int age;
//int
Scanner sc = new Scanner(System.in);
//do{
System.out.println("veuillez saisir votre jour de naissance:");
jour_naissance = sc.nextInt();
System.out.println("veuillez saisir votre mois de naissance:");
mois_naissance = sc.nextInt();
System.out.println("veuillez saisir votre année de naissance:");
année_naissance = sc.nextInt();
System.out.println("veuillez saisir le jour actuel:");
jour_actuel = sc.nextInt();
System.out.println("veuillez saisir le mois actuel:");
mois_actuel = sc.nextInt();
System.out.println("veuillez saisir l'année actuel");
année_actuel = sc.nextInt();
if (année_actuel < année_naissance){
	System.out.println("erreur age negatif");
}
else{
}
age = année_actuel - année_naissance;
if (mois_actuel < mois_naissance){
	age = age - 1;
}
if ((mois_actuel == mois_naissance) && (jour_naissance > jour_actuel)){
	age = age - 1;
}
System.out.println("age =" + age);
//}while( )
}
}