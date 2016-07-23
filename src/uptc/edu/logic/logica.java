package uptc.edu.logic;

import java.util.Scanner;

public class logica {

	
	private int arrUno[];
	private int tamaño, borrar;
	private Scanner sc;


	public logica(){

		beginComponets();
		llenarArrUno();
		borrarElemento();
	}


	private void beginComponets() {

		sc = new Scanner(System.in);
		System.out.println("Ingrese el tamaño del vector");
		tamaño = sc.nextInt();
		arrUno = new int [tamaño];	
	}

	private void llenarArrUno(){


		for (int i = 0; i < arrUno.length; i++) {

			int al = (int)(Math.random()*100);
			arrUno[i] = al;
			
			System.out.println(arrUno[i]);
		}
		System.out.println("------------------------------");
		
	}

	private void borrarElemento(){
		
		System.out.println("Ingrese la posición a eliminar");			
		borrar = sc.nextInt();
		
		if (borrar <= arrUno.length) {
			
			arrUno[borrar]=0;
			
			for (int i =  borrar+1; i < arrUno.length ; i++) {
				
				arrUno[i-1] = arrUno[i];
				
			}
			for (int j = 0; j < arrUno.length-1; j++) {
				
				System.out.println(arrUno[j]);
			}
		}else{
			
			System.out.println("Posición no valida, el tamaño del vector es: "+arrUno.length +", no puede ser mayor a este número." );
			borrarElemento();
		}
		
	}

	public static void main(String[] arg){

		logica l = new logica();
	}
}
