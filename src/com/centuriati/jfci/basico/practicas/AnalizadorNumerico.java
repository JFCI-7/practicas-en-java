package com.centuriati.jfci.basico.practicas;

public class AnalizadorNumerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] numeros = {7, 3, 15, 22, 8, 31, 12, 9, 4, 18};
		
		int suma = 0;
		double promedio = 0;
		int numMasGrande = 0;
		int numMasPequenio = 0;
		
		int numPosicionCero = 0;
		String cadena = "";
		

		
		
		numPosicionCero = numeros[0];
		

		System.out.println("--- Tabla de multiplicar del " + numPosicionCero + " ---");

		
		for(int n = 0, m = 1; n < numeros.length; n++, m++) {
			
			System.out.println(numPosicionCero + " x " +  m + " = " + (numPosicionCero * m));
			
		}
		
		
		System.out.println("\n--- Análisis del arreglo ---");
		for(int n = 0; n < numeros.length; n++) {
			
			cadena += numeros[n] + ", ";
			
		}
		
		for(int n = 0; n < numeros.length; n++) {
			
			suma = suma + numeros[n];
			
		}
		
		numMasGrande = numeros[0];
		numMasPequenio = numeros[0];
		
		for(int n = 0; n < numeros.length; n++) {
			
		
			if(numMasGrande < numeros[n]) {
				numMasGrande = numeros[n];
			} 
			
			if(numMasPequenio > numeros[n]) {
				numMasPequenio = numeros[n];
			} 
			
			
		}
		
		promedio = (double)suma / numeros.length;
		
		System.out.println("Números: ["+ cadena.substring(0, cadena.length() - 2) +"]");
		System.out.println("Suma: " + suma);
		System.out.println("Promedio: " + promedio);
		System.out.println("Máximo: " + numMasGrande);
		System.out.println("Mínimo: " + numMasPequenio);
		

	}
	
	

}
