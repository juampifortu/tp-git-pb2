package ar.edu.unlam.pb2;

import java.util.Scanner;

	public class MiCalculadora {
		
					
			private static Scanner teclado;
			static Integer resultado = 0;
			
			
			public static void sumar(Integer a2, Integer b2) {
			
			resultado = a2 + b2;
		}
			
			
			public static void restar(Integer a2, Integer b2) {
				
				resultado = a2 -b2;
				
			}
		public static void main(String[] args) {
		Scanner teclado;
		teclado=new Scanner(System.in);
		
		

		Integer a=0;
		Integer b=0;
		Integer opcion=null;
		Integer resultado=0;
		
		
	
		do{
		System.out.println("Ingrese su operación \n 1 para restar \n 2 para sumar \n 3 para multiplicar \n 4 para dividir");
		opcion = teclado.nextInt();
		}while(opcion < 1 && opcion > 4);
			
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		
		switch(opcion){
		
		case 1:
			resultado= a - b;
			restar(a,b);
			break;
		
		case 2:
			resultado = a + b;
			sumar(a,b);
			break;
		
		case 3:
			resultado = a * b;
			break;
			
		case 4:
			if(b!=0){
			resultado = a / b;
			}
			else{
				System.out.println("No se puede dividir por cero");
			}
			}
		
		System.out.println("El resultado es " + resultado.toString());
		}
	
		}
