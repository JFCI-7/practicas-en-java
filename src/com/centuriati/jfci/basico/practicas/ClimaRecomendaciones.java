package com.centuriati.jfci.basico.practicas;

public class ClimaRecomendaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double temperatura = 14;
		boolean estaLloviendo = true;
		
		String mensaje = "";
		String recomendacion = "";
		
		if(temperatura < 0) {
			mensaje = "¡Hace mucho frío! Temperatura bajo cero";
			recomendacion = (estaLloviendo) ? "Lleva abrigo y paraguas" : "Lleva abrigo" ;
		} else if(temperatura >= 0 && temperatura < 15) {
			mensaje = "Clima frío";			
			recomendacion = (estaLloviendo) ? "Lleva abrigo y paraguas" : "Lleva abrigo" ;

		} else if(temperatura >= 15 && temperatura < 25) {
			mensaje = "Clima templado";
			recomendacion = (estaLloviendo) ? "Lleva paraguas, el clima está templado" : "Clima agradable, disfruta el día";
			
		}	else if(temperatura >= 25 && temperatura < 35) {
			mensaje = "Clima cálido";
			recomendacion = (estaLloviendo) ? "Lleva paraguas y mantente hidratado" : "Usar protector solar y mantente hidratado";
		} else {
			mensaje = "¡Hace mucho calor!";
			recomendacion = (estaLloviendo) ? "Lleva paraguas y mantente hidratado" : "Usar protector solar y mantente hidratado";
		}
		
		
		
		System.out.println("=== REPORTE DEL CLIMA ===");
		System.out.println("Temperatura actual: " + temperatura + "°C");
		System.out.println("¿Está lloviendo?: " + estaLloviendo);
		System.out.println("Clasificación: " + mensaje);
		System.out.println("Recomendación: " + recomendacion);
		
		
		
		
	}

}
