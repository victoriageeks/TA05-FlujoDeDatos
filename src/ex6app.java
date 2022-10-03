import javax.swing.JOptionPane;
public class ex6app {

	public static void main(String[] args) {
		/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA será una constante que será del 21%*/
		
		final double IVA = 0.21;
		String valUsuario = JOptionPane.showInputDialog("Introduce el precio del producto:");
		double precio = Double.parseDouble(valUsuario);
		JOptionPane.showMessageDialog(null, "El producto tiene un precio de "+precio+" euros y su precio final es de "+(precio+(precio*IVA))+" euros.");
	}

}
