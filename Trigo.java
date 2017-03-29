import java.util.Scanner;

public class Trigo {
	public static void main (String [] args) {
		float angle_degre = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Saisissez la valeur de votre angle en degrés");
		angle_degre = sc.nextFloat();
		double angle_radian = Math.toRadians(angle_degre);
		System.out.println("Valeur de votre angle en radian :"+angle_radian);
		double cos = Math.cos(angle_radian);
		System.out.println("Cosinus :"+cos);
		double sin = Math.sin(angle_radian);
		System.out.println("Sinus :"+sin);
		double tan = Math.tan(angle_radian);
		System.out.println("Tangente :"+tan);
	}
}

