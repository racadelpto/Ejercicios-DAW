package Tema1;

public class ejercicioDosNumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos 2 n�meros enteros para la operaci�n
		int numero1;
		int numero2;
		
		//Generamos n�meros aleatorios para los n�meros creados
		numero1=(int) (Math.random()*100);
		numero2=(int) (Math.random()*100);
		
		//Mostramos los n�meros generados aleatoriamente
		System.out.println("El n�mero 1 es " + numero1);
		System.out.println("El n�mero 2 es " + numero2);
		
		//Finalmente realizamos la resta
		System.out.println("La resta del numero1 menos el numero2 es " + (numero1 - numero2));
		
	}

}
