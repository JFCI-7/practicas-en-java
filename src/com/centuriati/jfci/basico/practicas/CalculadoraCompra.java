package com.centuriati.jfci.basico.practicas;

public class CalculadoraCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precioProducto1 = 25.50;
		double precioProducto2 = 12.30;
		double precioProducto3 = 8.90;
		
		int cantidadProducto1 = 2;
		int cantidadProducto2 = 1;
		int cantidadProducto3 = 3;
		
		int descuentoPorcentaje = 10;
		int impuestoPorcentaje = 16;
		
		double subtotalProducto1 = precioProducto1 * cantidadProducto1;
		double subtotalProducto2 = precioProducto2 * cantidadProducto2;
		double subtotalProducto3 = precioProducto3 * cantidadProducto3;
		
		double subTotal =  subtotalProducto1 + subtotalProducto2 + subtotalProducto3;
		
		double montoDecuento = subTotal * (descuentoPorcentaje / 100.0);
		
		double subTotalConDescuento = subTotal - montoDecuento;
		
		double montoImpuesto = subTotalConDescuento * (impuestoPorcentaje / 100.0);
		
		
		
		double totalAPagar = subTotalConDescuento + montoImpuesto;
		
		System.out.println("=== TICKET DE COMPRA ===");
		System.out.println("Producto 1: $" + precioProducto1 + " x " + cantidadProducto1 + " = " + subtotalProducto1);
		System.out.println("Producto 2: $" + precioProducto2 + " x " + cantidadProducto2 + " = " + subtotalProducto2);
		System.out.println("Producto 3: $" + precioProducto3 + " x " + cantidadProducto3 + " = " + subtotalProducto3);
		System.out.println("------------------------");
		System.out.println("SUBTOTAL: $" + subTotal);
		System.out.println("Descuento: (10%) -$" + montoDecuento);
		System.out.println("Subtotal con descuento: $" + subTotalConDescuento);
		System.out.println("Impuesto (16%): +$" + montoImpuesto);
		System.out.println("------------------------");
		System.out.println("TOTAL A PAGAR: $" + totalAPagar);
		

	}

}
