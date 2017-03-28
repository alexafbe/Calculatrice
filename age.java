package Calculatrice;

import java.util.Scanner;

public class Age {
	public static void main(String[] args){
int date_Actuelle;
int jour_naissance;
int mois_naissance;	
int ann�e_naissance;
int jour_actuel;
int mois_actuel;
int ann�e_actuel;
int age;
//int
Scanner sc = new Scanner(System.in);
//do{
System.out.println("veuillez saisir votre jour de naissance:");
jour_naissance = sc.nextInt();
System.out.println("veuillez saisir votre mois de naissance:");
mois_naissance = sc.nextInt();
System.out.println("veuillez saisir votre ann�e de naissance:");
ann�e_naissance = sc.nextInt();
System.out.println("veuillez saisir le jour actuel:");
jour_actuel = sc.nextInt();
System.out.println("veuillez saisir le mois actuel:");
mois_actuel = sc.nextInt();
System.out.println("veuillez saisir l'ann�e actuel");
ann�e_actuel = sc.nextInt();
if (ann�e_actuel < ann�e_naissance){
	System.out.println("erreur age negatif");
}
else{
}
age = ann�e_actuel - ann�e_naissance;
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