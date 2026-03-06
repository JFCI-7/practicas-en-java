package com.centuriati.jfci.basico.practicas;

public class MaquinaExpendedora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 1;
		double cantidadDinero = 5.0;
		
		String producto = "";
		double precio = 0.0;
		double cambio = 0.0;
		double fataDinero = 0.0;
		
		String mensaje = "";
		
		
		switch(opcion) {
		
			case 1: // Refresco
				
				producto = "Refresco";
				precio = 1.50;		
				
				
				if(cantidadDinero >= 1.50) {		
					cambio = cantidadDinero - precio;
					mensaje = "Has comprado " + producto + ". Tu cambio: $" + cambio;						
				}else {
					fataDinero = precio - cantidadDinero;
					mensaje = "Fondos insuficientes para " + producto + ". Te faltan $" + fataDinero;
				} 
				
				break;
				
			case 2: // Papas
				
				producto = "Papas";
				precio = 1.00;	
				
				if(cantidadDinero >= 1.00) {			
					cambio = cantidadDinero - precio;
					mensaje = "Has comprado " + producto + ". Tu cambio: $" + cambio;						
				}else {
					fataDinero = precio - cantidadDinero;
					mensaje = "Fondos insuficientes para " + producto + ". Te faltan $" + fataDinero;
				} 
				
				break;
				
			case 3: // Chocolate
				
				producto = "Chocolate";
				precio = 2.00;	
				
				if(cantidadDinero >= 2.00) {		
					cambio = cantidadDinero - precio;
					mensaje = "Has comprado " + producto + ". Tu cambio: $" + cambio;						
				}else {
					fataDinero = precio - cantidadDinero;
					mensaje = "Fondos insuficientes para " + producto + ". Te faltan $" + fataDinero;
				} 
				
				break;
				
			case 4: // Agua
				producto = "Agua";
				precio = 1.00;	
				
				if(cantidadDinero >= 1.00) {		
					cambio = cantidadDinero - precio;
					mensaje = "Has comprado " + producto + ". Tu cambio: $" + cambio;						
				}else {
					fataDinero = precio - cantidadDinero;
					mensaje = "Fondos insuficientes para " + producto + ". Te faltan $" + fataDinero;
				} 
				
				break;
				
			case 5: // Galletas
				
				producto = "Galletas";
				precio = 1.25;	
				
				if(cantidadDinero >= 1.25) {	
					cambio = cantidadDinero - precio;
					mensaje = "Has comprado " + producto + ". Tu cambio: $" + cambio;						
				}else {
					fataDinero = precio - cantidadDinero;
					mensaje = "Fondos insuficientes para " + producto + ". Te faltan $" + fataDinero;
				} 
				
				break;
				
			default:
				
				mensaje = "Opción no válida";
				break;
		
		}
		
		
		System.out.println("=== MÁQUINA EXPENDEDORA ===");
		System.out.println("Opción seleccionada: " + opcion);
		System.out.println("Dinero insertado: $" + cantidadDinero);
		System.out.println("Resultado: " + mensaje);
		
		
		

	}

}
