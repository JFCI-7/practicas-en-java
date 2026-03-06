package com.centuriati.jfci.basico.practicas;

public class DatosPersonales {
	
	public static void main(String args[]) {
		
		String nombre = "Jesus Islas";
		int    edad   = 42;
		double estatura = 1.71;
		boolean esMayorDeEdad = true;
		char iniciaNombre = nombre.charAt(0);
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad + " años");
		System.out.println("Estatura: " + estatura + " metros");
		System.out.println("¿Mayor de edad?: " + esMayorDeEdad);
		System.out.println("Inicial del nombre: " + iniciaNombre);
	}

}
