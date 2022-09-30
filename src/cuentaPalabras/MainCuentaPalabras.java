package cuentaPalabras;

import java.util.Scanner;

public class MainCuentaPalabras {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la aplicación.");
		System.out.println("Introduzca una frase:");
		
		Scanner escaner = new Scanner(System.in);
		String entrada = escaner.nextLine();
		
		int numeroP = numeroPalabras(entrada);
		StringBuffer palabras = new StringBuffer();
		palabras.append(numeroP);
		
		if(numeroP == 1) {
			palabras.append(" palabra");
		}else {
			palabras.append(" palabras");
		}
		
		System.out.println(palabras);
		
		
		escaner.close();
		
	}
	
	public static int numeroPalabras(String cadena) {
		int numero = 0;
		
		if(cadena.isEmpty()) {
			return 0;
		}
		
		Scanner esc = new Scanner(cadena);
		
		if(esc.next().equals(".")) {
			esc.close();
			return 0;
		}
		
		
		while(esc.hasNext()){
			esc.next();
			numero++;
		}
		
		esc.close();
		
		
		return numero;
	}

}
