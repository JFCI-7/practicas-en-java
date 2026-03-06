package com.centuriati.jfci.basico.practicas;

import java.util.Scanner;

public class AlcanciaMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		mostrarTitulo();
		
		double meta = obtenerMeta(scanner);
		
		double[] depositos =  obtenerDepositos(scanner);
		
		simularAhorro(meta, depositos);
		
		
		scanner.close();


	}
	
	
	public static void mostrarTitulo() {
		System.out.println("=== ALCANCÍA DIGITAL ===\n");		
	}
	
	public static double obtenerMeta(Scanner scanner) {
		
		
		
		System.out.println("¿Cuál es tu meta de ahorro?");
		double metaAhorrar = scanner.nextDouble();
		
		return metaAhorrar;
	}
	
	public static double[] obtenerDepositos(Scanner scanner) {
		
		double[] depositos;
		
		System.out.println("¿Cuántos depósitos vas a hacer?");
		
		int numeroDepositos = scanner.nextInt();
		
		depositos = new double[numeroDepositos];
		
		for(int d = 0; d < depositos.length; d++) {
			System.out.println("Depósito " + (d+1) + ": ");
			depositos[d] = scanner.nextDouble();
		} 
		
		return depositos;
		
	}
	
	public static void simularAhorro(double meta, double[] depositos) {

		double ahorrado = 0.0;
		
		System.out.println("\n--- Simulación de ahorro ---\n");
		
		
		for(int a = 0; a < depositos.length; a++) {
			
			System.out.println("Llevas ahorrado: $" + ahorrado + ". Te faltan: $" + (meta - ahorrado));
			
			ahorrado = ahorrado + depositos[a];
			System.out.println("Depositas: $" + depositos[a] + " → Acumulado: $" + ahorrado);
			
		}
		

		
		System.out.println("=== RESULTADO FINAL ===");
		System.out.println("Meta: $" + meta);
		System.out.println("Total ahorrado: $" + ahorrado);
		
		String mensaje = (ahorrado < meta) ? "No alcanzaste la meta!" : 
			             (ahorrado > meta) ? "Superaste la meta!" : 
			            	 "¡Meta alcanzada exactamente!"; 
		
		System.out.println(mensaje);

		
	}
	
	
	

}
