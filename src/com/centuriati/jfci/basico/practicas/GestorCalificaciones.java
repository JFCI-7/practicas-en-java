package com.centuriati.jfci.basico.practicas;

import java.util.Scanner;

public class GestorCalificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		double[] calificaciones; 
		
		System.out.println("=== GESTOR DE CALIFICACIONES ===");

		System.out.println("Número de estudiantes:");
		int totalEstudiantes = scanner.nextInt();
		calificaciones = new double[totalEstudiantes];
		double calificacion = 0;
		
		System.out.println("\n--- Ingreso de calificaciones ---");
		for(int cal = 0; cal < calificaciones.length; cal++) {
			
			
			System.out.println("Estudiante " + (cal + 1) + ": ");
			calificacion = scanner.nextDouble();
			
			calificaciones[cal] = calificacion;
			
		}
		
		
		/*
		System.out.println("\n--- Resultados ---");
		
		for(double cal : calificaciones) {
			System.out.println(cal);
		}*/
		
		
		System.out.println("\n--- Resultados ---");
		
		String cadenaCalificaciones = "";
		for(double cal : calificaciones) {
			cadenaCalificaciones = cadenaCalificaciones + cal + ", ";
		}
		
		System.out.println("\nCalificaciones: " + cadenaCalificaciones.substring(0, cadenaCalificaciones.length() - 2));
		
		double promedio = 0.0;
		double suma = 0.0;
		for(int p = 0; p < calificaciones.length; p++) {
			suma = suma + calificaciones[p];
		}
		
		promedio = suma / calificaciones.length;
		System.out.println("Promedio: " + promedio);
		
		double calificacionMax = calificaciones[0];
		double calificacionMin = calificaciones[0];
		double totalAprobados = 0;
		double totalReprobados = 0;
		
		for(int num = 0; num < calificaciones.length; num++) {
			
			if(calificacionMax < calificaciones[num]) {
				calificacionMax = calificaciones[num];
			} 
			
			if(calificaciones[num] < calificacionMin) {
				calificacionMin = calificaciones[num];
			}
			
			if(calificaciones[num] >= 5.0) {
				totalAprobados++;
			} else {
				totalReprobados++;
			}

		}
		
		
		System.out.println("Nota más alta: "  + calificacionMax);
		System.out.println("Nota más baja: " + calificacionMin);

		
		System.out.println("Aprobados: [" + (int)totalAprobados + "] (" + (totalAprobados * (double)100) / (double)calificaciones.length + "%)");
		System.out.println("Suspensos: [" + (int)totalReprobados + "] (" + (totalReprobados * (double)100) / (double)calificaciones.length + "%)");
		
		System.out.println("\n--- Calificaciones ordenadas (mayor a menor) ---");
		
		
		
		double[] calificacionesOrden = new double[calificaciones.length];
		System.arraycopy(calificaciones, 0, calificacionesOrden, 0, calificaciones.length);
		
		
		for (int i = 0; i < calificacionesOrden.length - 1; i++) {
		    for (int j = 0; j < calificacionesOrden.length - 1 - i; j++) {
		        if (calificacionesOrden[j] < calificacionesOrden[j + 1]) {
		            // Intercambiar
		            double temp = calificacionesOrden[j];
		            calificacionesOrden[j] = calificacionesOrden[j + 1];
		            calificacionesOrden[j + 1] = temp;
		        }
		    }
		}
		
		String ordenada = "";
		for(double o : calificacionesOrden) {
			ordenada += o + ", ";	
		}
		
		System.out.println("[" + ordenada + "]");
		
		

	}

}
