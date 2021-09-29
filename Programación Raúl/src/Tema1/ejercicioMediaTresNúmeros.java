package Tema1;

public class ejercicioMediaTresNúmeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos 3 números enteros para el ejercicio y otro número adicional que nos dará el resultado de la media.
		int numero1;
		int numero2;
		int numero3;
		int media;
		
		//Generamos números aleatorios en las 3 números creados.
		numero1=(int) (Math.random()*100);
		numero2=(int) (Math.random()*100);
		numero3=(int) (Math.random()*100);
	
		//Le asignamos a media el valor de la operación de sumar los 3 números y dividirlos entre 3
		media= (numero1 + numero2 + numero3)/3;
		
		//A continuación, mostramos el valor que finalmente tiene media
		System.out.println("La media de los 3 números generados aleatoriamente es " + media);
		
		/*
		 * Además mostramos los 3 números generados aleatoriamente para comprobar que la operación es correcta
		 */
		System.out.println("El número 1 es " + numero1);
		System.out.println("El número 2 es " + numero2);
		System.out.println("El número 3 es " + numero3);

	}

}
