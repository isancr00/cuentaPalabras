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
		char[] letras = rellenarArray();
		int[] veces = numeroLetras(entrada);
		
		for(int i=0;i<26;i++) {
			if(veces[i] != 0) {
				System.out.println(veces[i] + " " + letras[i]);
			}
		}
	
		escaner.close();
		
	}
	
	public static int numeroPalabras(String cadena) {
		int numero = 0;
		
		if(cadena.isEmpty()) {
			return 0;
		}
		
		Scanner esc = new Scanner(cadena);
		
		/*
		if(esc.next().equals('.')) {
			esc.close();
			return 0;
		}
		*/
		
		
		while(esc.hasNext()){
			esc.next();
			numero++;
		}
		
		esc.close();
		
		
		return numero;
	}
	
	public static int[] numeroLetras(String cadena) {
		char[] letras = rellenarArray();
		int[] veces = new int[27];
		for(int i=0;i<26;i++) {
			veces[i] = 0;
		}
		Scanner esc = new Scanner(cadena.toLowerCase());
		
		while(esc.hasNext()) {
			
			String palabra = esc.next();
			char[] palabraChar = palabra.toCharArray();
			
			for(int i=0;i<palabraChar.length;i++) {
				if(palabraChar[i] != '.' && palabraChar[i] != ',' && palabraChar[i] != ';') {
					int posicionLetra = buscarLetraArray(letras, palabraChar[i]);
					veces[posicionLetra] += 1;
				}	
			}
			
		}
		
		
		esc.close();
		
		
		
		return veces;
	}
	
	
	public static int buscarLetraArray(char[] letras, char letra) {
		int posicion = 0;
		for(int i=0;i<26;i++) {
			if(letras[i] == letra) {
				return i;
			}
		}
		
		return posicion;
	}
	
	
	public static char[] rellenarArray() {
		
		char[] devuelve = new char[27];
		
		devuelve[0] = 'a';	
		devuelve[1] = 'b';
		devuelve[2] = 'c';
		devuelve[3] = 'd';		
		devuelve[4] = 'e';
		devuelve[5] = 'f';
		devuelve[6] = 'g';
		devuelve[7] = 'h';
		devuelve[8] = 'i';
		devuelve[9] = 'j';
		devuelve[10] = 'k';
		devuelve[11] = 'l';
		devuelve[12] = 'm';
		devuelve[13] = 'n';
		devuelve[14] = 'ñ';
		devuelve[15] = 'o';
		devuelve[16] = 'p';
		devuelve[17] = 'q';
		devuelve[18] = 'r';
		devuelve[19] = 's';
		devuelve[20] = 't';
		devuelve[21] = 'u';
		devuelve[22] = 'v';
		devuelve[23] = 'w';
		devuelve[24] = 'x';
		devuelve[25] = 'y';
		devuelve[26] = 'z';
		
		
		
		return devuelve;
	}

}
