package juegoadivinar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int NumeroAdivinar = (int) (Math.random() *10);
		int NumeroUsuario= 0;
		int intentos = 0;
		
		System.out.println("\nADIVINA EL NÚMERO");
		do {
				
				System.out.println(" Ingrese un Número del 1 al 10: ");
				NumeroUsuario = scanner.nextInt();
				intentos++;
				
				if (NumeroUsuario == NumeroAdivinar & intentos <5){
					System.out.print("HAS ADIVINADO! EL NÚMERO ES " + NumeroAdivinar+ 
					" LO HAS LOGRADO EN " +intentos+ " INTENTOS. ");}
				
				else {if (NumeroUsuario < NumeroAdivinar) {
					System.out.println("El número debe ser mayor. Intenta otra vez. ");} 	
				
				else {if  (NumeroUsuario > NumeroAdivinar) {
					System.out.println("El número debe ser menor. Intenta de nuevo. ");} }
				}
				}
			
			      while (NumeroUsuario != NumeroAdivinar & intentos<5);
			      if (NumeroUsuario != NumeroAdivinar){
			      System.out.print("HAS USADO TODOS LOS INTENTOS. EL NÚMERO ERA " +NumeroAdivinar);}

}
}
