package isoII.ej3;

import java.util.Scanner;


public class main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main (String [] args) {
		System.out.println("Vamos a determinar que actividades podemos hacer mediante una serie de preguntas "
				+ "cortas");
		
		System.out.println("Se encuentra usted en plenas facultades fisicas? (responda SI/NO)");
		String respuesta = sc.nextLine();
		
		if(respuesta.equalsIgnoreCase("no")) {
			System.out.println("No podra realizar ninguna actividad");
		}
		
		
		System.out.println("Ha tenido usted algun sintoma o alguna enfermedad infecciosa las ultimas "
				+ "2 semanas?  (responda SI/NO)");
		respuesta = sc.nextLine();
		
		if(respuesta.equalsIgnoreCase("si")) {
			System.out.println("No podra realizar ninguna actividad");
		}
		
		
		
		System.out.println("Cual es la temperatura meteorologica actual? (responda en formato de numero entero)");
		int numero = sc.nextInt();
		sc.nextLine();
		
		if(numero < 0) {
			System.out.println("Cual es la humedad relativa ? (responde el numero entero del porcentaje)");
			int humedad = sc.nextInt();
			sc.nextLine();
			
			if(humedad <= 15) {
				System.out.println("hay precipitaciones de nieve o agua? (reponde SI/NO)");
				respuesta = sc.nextLine();
				
				if(respuesta.equalsIgnoreCase("si")) {
					System.out.println("la recomendacion es quedarse en casa");
				}else if(respuesta.equalsIgnoreCase("no")) {
					System.out.println("");
				}
			}
			
		}else if(numero >= 0 && numero <= 15) {
			
		}else if(numero > 15 && numero <= 25) {
			
		}else if(numero > 25 && numero <= 35) {
			
		}else if(numero > 35) {
			
		}
		
		
	}
}
