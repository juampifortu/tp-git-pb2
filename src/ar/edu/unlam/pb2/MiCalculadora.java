package ar.edu.unlam.pb2;

import java.util.Scanner;

	public class MiCalculadora {
			
		static Integer resultado=0;
		
		public static void Division (Integer a, Integer b) {
			if(b!=0){
			resultado = a / b;
			}
			else{
				System.out.println("No se puede dividir por cero");
			}
			
			System.out.println("El resultado es " + resultado.toString());
		}
		
		public static void Multiplicacion(Integer a, Integer b) {
			resultado = a * b;
			System.out.println("El resultado es " + resultado.toString());
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
			break;
		
		case 2:
			resultado = a + b;
			break;
		
		case 3:
			Multiplicacion(a,b);
			break;
			
		case 4:
			Division(a,b);
			}
		
		
		}
	
		}
