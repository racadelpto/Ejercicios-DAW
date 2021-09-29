package Tema1;

public class ejercicioDosNumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos 2 números enteros para la operación
		int numero1;
		int numero2;
		
		//Generamos números aleatorios para los números creados
		numero1=(int) (Math.random()*100);
		numero2=(int) (Math.random()*100);
		
		//Mostramos los números generados aleatoriamente
		System.out.println("El número 1 es " + numero1);
		System.out.println("El número 2 es " + numero2);
		
		//Finalmente realizamos la resta
		System.out.println("La resta del numero1 menos el numero2 es " + (numero1 - numero2));
		
	}

}
