package com.centuriati.jfci.basico.practicas;

import java.util.Scanner;

public class GestorContador {
	
	static int contadorGlobal = 0;
	static int totalOperaciones = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== GESTOR DE CONTADOR ===");
		
		System.out.println("\nOperaciones:");
		System.out.println("1. Incrementar (1)");
		System.out.println("2. Incrementar (cantidad)");
		System.out.println("3. Decrementar");
		System.out.println("4. Resetear");
		System.out.println("5. Mostrar valor");
		System.out.println("6. Mostrar estadísticas");
		System.out.println("7. Salir");
		
		
		int opcion = 0;

		do {
			
			System.out.println("\nSelecciona una opción del menú: ");
			opcion = scanner.nextInt();
			
		
			switch(opcion) {
			
				case 1:
					
					incrementar();
					mostrarValor();
					break;
				case 2:
					
					System.out.println("Introduce cantidad a incrementar: ");
					int cantidadI = scanner.nextInt();
					incrementar(cantidadI);
					mostrarValor();
					
					break;
				case 3:
					
					decrementar();	
					mostrarValor();
					break;
				case 4:
					
					resetear();
					mostrarValor();
					break;
				case 5:
					
					mostrarValor();
					break;
				case 6:
					
					System.out.println("\n[Demonstración de ámbito:]");	
					estadisticas();
					System.out.println("Variable de clase real: " + contadorGlobal);
					
					break;
				case 7:
					
					System.out.println("Salir, Vuelve pronto!");
					
					break;
				default:
					
					System.out.println("Opción incorrecta. Elige una opción del menú");
					
					break;
			
			}
		
		}while(opcion != 7);
		
		
		
		scanner.close();

	}
	
	
	/**
	 * 
	 */
	public static void incrementar() {
		
		contadorGlobal++;
		totalOperaciones++;
	}
	
	/**
	 * 
	 * @param cantidad
	 */
	public static void incrementar(int cantidad) {
		contadorGlobal += cantidad;
		totalOperaciones++;
	}
	
	/**
	 * 
	 */
	public static void decrementar() {
		
		if (contadorGlobal > 0) {
            contadorGlobal--;
        }
        totalOperaciones++;
	}
	
	
	/**
	 * 
	 */
	public static void resetear() {
		contadorGlobal = 0;
		totalOperaciones++;
	}
	
	/**
	 * 
	 */
	public static void mostrarValor() {
		System.out.println("Valor actual: " + contadorGlobal);
		System.out.println("Total operaciones: " + totalOperaciones);
	}
	
	public static void estadisticas() {
		int contadorGlobal = 999;
		System.out.println("Variable local 'contadorGlobal' dentro del método: " + contadorGlobal);
		
	}
	
	

}
