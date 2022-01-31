package operadoresLogicos;
import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
	try (Scanner scann = new Scanner(System.in)) {
	//Ingresar nombres y edades
	System.out.println("Ingresa tu estatura en metros: ");
	double est = scann.nextDouble();
	System.out.println("Ingresa tu peso en kg: ");
	double peso = scann.nextDouble();
	double imc =  peso / (est * est);  
	if (imc >= 18.5 && imc <=24.9 ) {
	System.out.println("Tu indice de masa corporal esta normal");
	}else if (imc < 18.5 ) {
	System.out.println("Pesa mas un perro panzon");
	}else if(imc > 25){
	System.out.println("Checate, midete, cuidate, quierete mi Ricky");
	}
	System.out.println("Tu IMC es de: " + imc);
		}
		}
}