package juegoadivinar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Objeto de la clase Scanner
		Scanner scanner = new Scanner(System.in);

		int NumeroAdivinar = (int) (Math.random() *10); // Numero aleatorio entre 1 y 10
		int NumeroUsuario= 0;
		int intentos = 0;
		
		System.out.println("\nADIVINA EL NÚMERO");
		do {
		try { // Abre método Try Catch validación de entrada
			   
			System.out.println(" Ingrese un Número del 1 al 10: ");
				NumeroUsuario = scanner.nextInt(); //Ingresa el Numero del Usuario
				intentos++; // Contador
				
				if (NumeroUsuario == NumeroAdivinar & intentos <5){ // Cantidad de Intentos
					System.out.print("HAS ADIVINADO! EL NÚMERO ES " + NumeroAdivinar+ 
					" LO HAS LOGRADO EN " +intentos+ " INTENTOS. ");}
				
				else {if (NumeroUsuario < NumeroAdivinar) {
					System.out.println("El número debe ser mayor. Intenta otra vez. ");} //Numero demasiado bajo	
				
				else {if  (NumeroUsuario > NumeroAdivinar) {
					System.out.println("El número debe ser menor. Intenta de nuevo. ");} } //Numero demasiado alto
				}
				} catch(InputMismatchException e) {
		             scanner.nextLine();
		             System.out.println("ERROR! INTENTALO DE NUEVO INGRESANDO UN NÚMERO DEL 1 AL 10 ");} // Cierra Try Catch
		
		        } while (NumeroUsuario != NumeroAdivinar & intentos<5);
			      if (NumeroUsuario != NumeroAdivinar){
			      System.out.print("HAS USADO TODOS LOS INTENTOS. EL NÚMERO ERA " +NumeroAdivinar);} //Han finalizado los intentos
			      scanner.close();

}
}
