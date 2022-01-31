package controlDeFlujo;
import java.util.Scanner;

public class ejercicios {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Ingrese una cantidad");
	double cantidad= s.nextDouble();
	if (cantidad>=10000) {
		System.out.println("Tu comisión es: " + (cantidad*0.3));
	}
	else if(cantidad >=5001 && cantidad <=9999) {
		System.out.println("Tu comisión es: " + (cantidad*0.2));
	}
	else if(cantidad >=1001 && cantidad <=5000) {
		System.out.println("Tu comisión es: " + (cantidad*0.1));
	}
		else {
			System.out.println("Para esta cantidad no aplica comisión");
		}
}
}
