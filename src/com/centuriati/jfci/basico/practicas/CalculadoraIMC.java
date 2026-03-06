package com.centuriati.jfci.basico.practicas;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		double imc = 0.0;
		String clasificación = "";
		String recomendación = "";
		
		
		System.out.println("Introduce tu nombre completo: ");
		String nombre = scanner.nextLine();
		
		
		System.out.println("Introduce tu edad: ");
		int edad = scanner.nextInt();
		
		System.out.println("Introduce tu peso en Kilogramnos. Ej. 75.0: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Introduce tu estatura en metros. Ej. 1.78: ");
		double estatura = scanner.nextDouble();
		
		imc = peso / (estatura * estatura);
		
		
		scanner.close();
		
		if(imc < 18.5) {
			clasificación = "Bajo peso";
			recomendación = "Consulte a un nutricionista para una dieta de aumento de masa muscular";
		} else if(imc >= 18.5 && imc <= 24.9) {
			clasificación = "Peso normal";
			recomendación = "¡Felicidades! Mantenga su estilo de vida saludable";
		} else if(imc >= 25.0 && imc <= 29.9) {
			clasificación = "Sobrepeso";
			recomendación = "Se recomienda realizar ejercicio y mejorar hábitos alimenticios";
		} else if(imc >= 30.0) {
			clasificación = "Obesidad";
			recomendación = "Es importante consultar a un médico para un plan de tratamiento personalizado";
		} else {
			clasificación = "Sin clasificación";
		}
		
		
		System.out.println("=== REPORTE DE IMC ===");		
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad + " años");
		System.out.println("Peso: " + peso + " kg");
		System.out.println("Estatura: " + estatura + " m");
		System.out.println("------------------------");
		System.out.printf("Su IMC es: %.1f\n", imc);
		System.out.println("Clasificación: " + clasificación);
		System.out.println("Recomendación: " + recomendación);
		
		
		System.out.println("\nLas recomendaciones son:");
		System.out.println("- Bajo peso: \"Consulte a un nutricionista para una dieta de aumento de masa muscular\"");
		System.out.println("- Peso normal: \"¡Felicidades! Mantenga su estilo de vida saludable\"");
		System.out.println("- Sobrepeso: \"Se recomienda realizar ejercicio y mejorar hábitos alimenticios\"");
		System.out.println("- Obesidad: \"Es importante consultar a un médico para un plan de tratamiento personalizado\"");
		
		
		

	}

}
