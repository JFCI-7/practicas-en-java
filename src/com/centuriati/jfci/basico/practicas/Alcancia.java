package com.centuriati.jfci.basico.practicas;

public class Alcancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double metaAhorro = 100.0;
		double ahorrado = 0.0;
		double deposito = 0.0;
		
		double[] depositos = {20.0, 15.0, 30.0, 25.0, 10.0, 5.0};		
		int index = 0;
		
		System.out.println("=== ALCANCÍA DIGITAL ===");
		System.out.println("Meta: $" + metaAhorro + "\n");
		
		
		while(ahorrado < metaAhorro) {
			
			
			if(ahorrado == metaAhorro) break;
			
			System.out.println("Llevas ahorrado: $" + ahorrado + ". Te faltan: $" + (metaAhorro - ahorrado));
			
			deposito = depositos[index];
			ahorrado = ahorrado + deposito;
			
			System.out.println("Depositas: $" + deposito + "\n");
			
			
			index++;
					
			
		}
		
		System.out.println("¡Meta alcanzada! Has ahorrado: $" + ahorrado);
		
	
	}

}
