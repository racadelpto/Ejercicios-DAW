package Tema1;

public class ejercicioMediaTresN�meros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos 3 n�meros enteros para el ejercicio y otro n�mero adicional que nos dar� el resultado de la media.
		int numero1;
		int numero2;
		int numero3;
		int media;
		
		//Generamos n�meros aleatorios en las 3 n�meros creados.
		numero1=(int) (Math.random()*100);
		numero2=(int) (Math.random()*100);
		numero3=(int) (Math.random()*100);
	
		//Le asignamos a media el valor de la operaci�n de sumar los 3 n�meros y dividirlos entre 3
		media= (numero1 + numero2 + numero3)/3;
		
		//A continuaci�n, mostramos el valor que finalmente tiene media
		System.out.println("La media de los 3 n�meros generados aleatoriamente es " + media);
		
		/*
		 * Adem�s mostramos los 3 n�meros generados aleatoriamente para comprobar que la operaci�n es correcta
		 */
		System.out.println("El n�mero 1 es " + numero1);
		System.out.println("El n�mero 2 es " + numero2);
		System.out.println("El n�mero 3 es " + numero3);

	}

}
