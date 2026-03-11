package com.centuriati.jfci.basico.practicas;

import java.util.Random;
import java.util.Scanner;

public class AnalizadorTexto {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int opcion = 0;
		
		System.out.println("=== ANALIZADOR DE TEXTO ===\n");
		
		System.out.println("Ingresa un texto a analizar: ");
		String texto = scanner.nextLine();
		
		
		do {
			

			
			
			
			imprimeMenu();
			
			
			
			System.out.println("Selecciona una opción:  ");
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("==============");
			System.out.println(texto);
			System.out.println("==============");
			
			switch(opcion) {
			
				case 1:
					
					logitudTexto(texto);
					
					break;				
				case 2:
					
					numeroPalabras(texto);					
					break;				
				case 3:
					
					textoMayusculas(texto);
					
					break;				
				case 4:
					
					textoMinusculas(texto)
;					
					break;				
				case 5:
					
					System.out.println("Escribe la pabra que quieras reemplazar: ");
					String rempPalabra = scanner.next();
					
					reemplazaPalabra(texto, rempPalabra);
					
					break;				
				case 6:
					
					int inicio = 0;
					int fin = 0;
					
					System.out.println("Introduce numero entre el 0 y el " + (texto.length() - 1));
					inicio = scanner.nextInt();
					
					System.out.println("Introduce otro numero entre el 0 y el " + (texto.length() - 1));
					fin = scanner.nextInt();
					
					extraerSubCadena(texto, inicio, fin);
					
					break;				
				case 7:
					
					System.out.println("Introduce la palabra que quieres buscar: ");
			    	String buscPalabra = scanner.nextLine();
					buscarPalabra(texto, buscPalabra); 
					
					break;				
				case 8:
					
					System.out.println("Introduce una letra: ");
			    	String letra = scanner.nextLine();
					
					contarConcurrenciaLetra(texto, letra);
					
					break;		
				case 9:
					
					invertirTexto(texto);
					
					break;				
				case 10:
					
					esPalindromo(texto);
					
					break;
				case 11:
					
					estadisticas(texto); 
					
					break;				
				case 12:
					
					System.out.println("Salir. Vuelve pronto!");
					
					break;
			}
			
			System.out.println("Presiona enter para continuar:  ");
			scanner.next();
			
			
			
		}while(opcion != 12);
		
		System.out.println();
		
		
		scanner.close();

	}
	
	public static String capturaTexto() {
		
		System.out.println("\n Ingresa un texto: ");
		//String texto = scanner.next();
		
		return "";
	}
	
	public static void imprimeMenu() {
		
		System.out.println("\n--- MENÚ ---");
		System.out.println("1. Longitud del texto");
		System.out.println("2. Número de palabras");
		System.out.println("3. Texto en mayúsculas");
		System.out.println("4. Texto en minúsculas");
		System.out.println("5. Reemplazar una palabra");
		System.out.println("6. Extraer subcadena");
		System.out.println("7. Buscar una palabra (mostrar posición)");
		System.out.println("8. Contar ocurrencias de una letra");
		System.out.println("9. Invertir el texto");
		System.out.println("10. Ver si es palíndromo (ej: \"ana\", \"reconocer\")");
		System.out.println("11. Mostrar estadísticas (vocales, consonantes, dígitos, espacios)");
		System.out.println("12. Salir");
		
	}
	
	public static void logitudTexto(String texto) {
		
		System.out.println("Resultado: " + "Logitud del texto: " + texto.length());
	}
	
	public static void numeroPalabras(String texto) {
		
		String[] totalPalabras = texto.split(" ");
		System.out.println("Resultado: " + "Número de palabras en el texto: " + totalPalabras.length);
		
	}
	
	public static void textoMayusculas(String texto) {
		
		System.out.println("Resultado: " + texto.toUpperCase());
	}
	
    public static void textoMinusculas(String texto) {
		
		System.out.println("Resultado: " + texto.toLowerCase());
	}
    
    public static void reemplazaPalabra(String texto, String palabra) {
    	
    	String textoNuevo = "";
    	
    	textoNuevo = texto.replace(palabra, "BRASIL");
    	
    	System.out.println("Resultado Texto nuevo: " + textoNuevo);
    	
    }
    
    public static void extraerSubCadena(String texto, int inicio, int fin) {
    	
    	String cadena = "";
    	cadena = texto.substring(inicio, fin);
    	
    	System.out.println("Resultado Subcadena: " + cadena);
    	
    }
    
    public static void buscarPalabra(String texto,String palabra) {
    	
    	
    	
    	
    	int posicionInicio = texto.indexOf(palabra);
    	int posicionFin = texto.lastIndexOf(palabra);
    	
    	System.out.println("resultado + Primera posición: " + posicionInicio);
    	System.out.println("Última posición: " + posicionFin);
    	
    	
    }
    
    public static void contarConcurrenciaLetra(String texto, String letra) {
    	
    	
    	
    	int contador = 0;
    	
    	StringBuilder sbTexto = new StringBuilder(texto);
    	
    	
    	
    	for(int i = 0; i < sbTexto.length(); i++) {
    		
    		if(String.valueOf(sbTexto.charAt(i)).equals(letra)) {
    			
    			contador++;
    			
    		}
    	}
    	
    	System.out.println("La letra \"" + letra + "\" aparece: " + contador + " veces.");

    	
    }
    
    public static void invertirTexto(String texto) {
    	
    	StringBuilder sbTexto = new StringBuilder(texto);
    	String textoInvertido = "";
    	
    	System.out.println("Invertir texto: ");
    	
    	// cadena
    	
    	for(int c = sbTexto.length() - 1; c > -1; c--) {
    		
    		
    		textoInvertido = textoInvertido + sbTexto.charAt(c);
    		
    	}
    	
    	System.out.println("Resultado: \n");
    	System.out.println(textoInvertido);
    	
    }
    
    
    public static void esPalindromo(String texto) {
    	
    	StringBuilder sbTexto = new StringBuilder(texto);
    	String textoInvertido = "";
    	
    	System.out.println("Invertir texto: ");
    	
    	// cadena
    	
    	for(int c = sbTexto.length() - 1; c > -1; c--) {
    		
    		
    		textoInvertido = textoInvertido + sbTexto.charAt(c);
    		
    	}
    	
    	textoInvertido = textoInvertido.replace(" ", "");
    	textoInvertido = textoInvertido.toLowerCase();
    	textoInvertido = textoInvertido.trim();    	
    	texto = texto.trim();
    	texto = texto.replace(" ", "");
    	texto = texto.toLowerCase();
    	
    	if(texto.equals(textoInvertido)) {
    		
    		System.out.println("Es palindromo.");
    		
    	} else {
    		System.out.println("NO es palindromo.");
    	}
    	
    }
    
    public static void estadisticas(String texto) {
    	
    	System.out.println("Estadisticas: \n");
    	
    	StringBuilder sbTexto = new StringBuilder(texto);
    	int numVocales = 0;
    	int numConsonantes = 0;
    	int numDigitos = 0;
    	int numEspacios = 0;
    	
    	
    	
    	char caracter;
    	
    	for(int i = 0; i < sbTexto.length(); i++) {
    		
    		if(sbTexto.charAt(i) == 'a' || sbTexto.charAt(i) == 'e' || sbTexto.charAt(i) == 'i' || sbTexto.charAt(i) == 'o' || sbTexto.charAt(i) == 'u') {
    			numVocales++;
    		} else {
    			
    			caracter = Character.toLowerCase(sbTexto.charAt(i));
    			
    			if(Character.isLetter(caracter) && !(sbTexto.charAt(i) == 'e' || sbTexto.charAt(i) == 'i' || sbTexto.charAt(i) == 'o' || sbTexto.charAt(i) == 'u')) {
    				numConsonantes++;
    				
    			} else if(Character.isDigit(caracter)){
    				numDigitos++;
    				
    			} else if(Character.isSpaceChar(caracter)) {
    				numEspacios++;
    			}
    		}
    		
    	}
    	
    	
    	
    	System.out.println("Resultado: \n");
    	
    	System.out.println("Total de vocales: " + numVocales);
    	System.out.println("Total de consonantes: " + numConsonantes);
    	System.out.println("Total de digitos: " + numDigitos);
    	System.out.println("Total de espacios: " + numEspacios);
    	
    	
    }
    
    
    
    
	
	

}














