package Tema1;

public class sumaDosNumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definición de variables
		//Creamos 3 numeros enteros para las operaciones
		int numero1;
		int numero2;
		int resultado; 
		
		/*
		 * Generamos un número aleatorio utilizando la funcion random de la librería Math.random, genera un 
		 * número aleatorio entre 1 y 0 en formato double, hay que convertir a int utilizando (int). Lo multiplicamos
		 * x1000 para que el número sea entero.
		 * Se mete entre paréntesis la multiplicación por 100 para que la haga primero.
		 */
		numero1=(int) (Math.random()*100);

		//Mostramos el numero1 generado
		System.out.println("El número 1 es: "+ numero1  + ". Ahora generaremos el siguiente");
		
		
		numero2=(int) Math.random()*100;
		
		//Mostramos el numero2 generado
		System.out.println("El número 2 es: "+ numero2);
		
		
		resultado=numero1 + numero2; 
		
		System.out.println("La suma de los dos números es: " + resultado);
		
		
	}

}
