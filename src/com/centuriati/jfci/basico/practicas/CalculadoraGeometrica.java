package com.centuriati.jfci.basico.practicas;

import java.util.Scanner;

public class CalculadoraGeometrica {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("=== CALCULADORA GEOMÉTRICA ===\n");
		
		System.out.println("Figuras disponibles:");
		System.out.println("1. Cuadrado");
		System.out.println("2. Rectángulo");
		System.out.println("3. Círculo");
		System.out.println("4. Triángulo");
		
		
		System.out.println("\nSelecciona una figura (1-4): ");
		int opcion = scanner.nextInt();
		
		switch(opcion) {
			case 1: 
				
				System.out.println("\n--- CUADRADO ---");
				
				System.out.println("\nIntroduce el valor de lado:");
				double lado = scanner.nextDouble();
				System.out.println("Lado: " + lado);
				
				System.out.println("\nResultados:");
				System.out.println("Area: " + area(lado));
				System.out.println("Perimetro: " + perimetro(lado));
				
				
				
				break;				
			case 2:
				
				System.out.println("\n--- RECTANGULO ---");
				
				
				System.out.println("\nIntroduce el valor de la base:");
				double base = scanner.nextDouble();
				System.out.println("\nIntroduce el valor de la altura:");
				double altura = scanner.nextDouble();
				
				
				System.out.println("Base: " + base);				
				System.out.println("Altura: " + altura);
				
				System.out.println("\nResultados:");
				System.out.println("Area: " + area(base, altura));
				System.out.println("Perimetro: " + perimetro(base, altura));
				
				break;
			case 3:
				
				System.out.println("\n--- CIRCULO ---");
				
				System.out.println("\nIntroduce el valor del radio:");
				double radio = scanner.nextDouble();
				System.out.println("Radio: " + radio);
				
				System.out.println("\nResultados:");
				System.out.println("Area: " + area(radio, true));
				System.out.println("Perimetro: " + perimetro(radio, true));
				
				break;
			case 4:
				
				System.out.println("\n--- TRIANGULO ---");
				
				System.out.println("\nIntroduce el valor de la base:");
				double baseT = scanner.nextDouble();
				System.out.println("Base: " + baseT);
				
				System.out.println("\nIntroduce el valor del lado1:");
				double lado1 = scanner.nextDouble();
				System.out.println("Lado1: " + lado1);
				
				System.out.println("\nIntroduce el valor del lado2:");
				double lado2 = scanner.nextDouble();
				System.out.println("Lado2: " + lado2);
				
				System.out.println("\nIntroduce el valor del lado3:");
				double lado3 = scanner.nextDouble();
				System.out.println("Lado3: " + lado3);
				
				
				System.out.println("\nResultados:");
				System.out.println("Area: " + area(baseT, lado1, 1));
				System.out.println("Perimetro: " + perimetro(lado1, lado2,lado3));
				
				break;
			default:
				
				System.out.println("Opción invalida.");
				break;
			
		}
		
		
		
		
		System.out.println();
		
		scanner.close();

	}
	
	
	
	/**
	 * 
	 * @param lado
	 * @return
	 */
	public static double area(double lado) {
		
		double area = lado * lado;		
		
		return area;
	}
	
	/**
	 * 
	 * @param base
	 * @param altura
	 * @return
	 */
	public static double area(double base, double altura) {
		
		double area = base * altura;
		
		return area;
	}
	
	/**
	 * 
	 * @param radio
	 * @param esCirculo
	 * @return
	 */
	public static double area(double radio, boolean esCirculo) {
		
		double area = 0;
		
		if(esCirculo) {
			area = Math.PI * (radio * radio);
		} else {
			area = 0;
		}
		
		return area;
	}
	
	/**
	 * 
	 * @param base
	 * @param altura
	 * @param tipo
	 * @return
	 */
	public static double area(double base, double altura, int tipo) {
		
		double area = (base * altura) / 2;
		
		return area;
	}
	
	/**
	 * 
	 * @param lado
	 * @return
	 */
	public static double perimetro(double lado) {
		
		double perimetro = 4 * lado;
		
		return perimetro;
	}
	
	/**
	 * 
	 * @param base
	 * @param altura
	 * @return
	 */
	public static double perimetro(double base, double altura) {
		
		double perimetro = 2 * (base + altura);
		
		return perimetro;
	}
	
	/**
	 * 
	 * @param radio
	 * @param esCirculo
	 * @return
	 */
	public static double perimetro(double radio, boolean esCirculo) {
		
        double perimetro = 0;
		
		if(esCirculo) {
			perimetro = 2 * Math.PI * radio;
		} else {
			perimetro = 0;
		}
		
		return perimetro;

	}
	
	/**
	 * 
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * @return
	 */
	public static double perimetro(double lado1, double lado2, double lado3) {
		
		double perimetro = lado1 + lado2 + lado3;
		
		return perimetro;
	}

}
