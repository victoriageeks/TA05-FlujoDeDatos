import javax.swing.JOptionPane;
public class ex10app {

	public static void main(String[] args) {
		/*Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrará la suma de todas las ventas. Piensa que es lo que se repite y lo que no.*/
		
		String valUsuarioVentas = JOptionPane.showInputDialog("Introduce el número de ventas:");
		int numVentas = Integer.parseInt(valUsuarioVentas);
		
		int sumaTotalVentas=0;
		
		for (int i=1; i<=numVentas; i++) {
			String valUsuarioPrecio = JOptionPane.showInputDialog("Introduce el precio de la venta: "+(i));
			int precioVenta = Integer.parseInt(valUsuarioPrecio);
			
			sumaTotalVentas=sumaTotalVentas+precioVenta;
		}
		JOptionPane.showMessageDialog(null, "La suma total de todas las ventas es: "+sumaTotalVentas);
	}

}
