package controlDeFlujo;
import java.util.Scanner;

public class descuentosPeliculas {
	
public static void main(String[] args) {
	Scanner s= new Scanner (System.in);
	System.out.println("Ingrese cantidad de boletos");
	int boletos= s.nextInt();
	System.out.println("Ingrese edad: ");
	int edad= s.nextInt();
	int boleto= 7;
	
	
	if  (edad >=5 && edad <=60){
	System.out.println("El costo del boleto es de 7 euros");	
	}
	else if (edad >=0 && edad <5){
		System.out.println("El costo es: " + (boleto*0.6));	
	}
	else if (edad >60 && edad <150){
		System.out.println("El costo es: " + (boleto*0.55));	
	}
	else
		System.out.println("No ingresaste una edad valida");
}
}
