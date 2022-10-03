public class ex9app {

	public static void main(String[] args) {
		/*Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.*/
		
		for ( int numero=1; numero <= 100; numero++) {
			if(numero%2==0 || numero%3==0) {
				System.out.println(numero);
			}
		}

	}
}