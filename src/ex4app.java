import javax.swing.JOptionPane;
public class ex4app {

	public static void main(String[] args) {
		/*Haz una aplicación que calcule el área de un círculo. El redio se pedirá por el teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math*/
		
		final double PI = 3.14;
		String valUsuario = JOptionPane.showInputDialog("Introduce el radio del círculo.");
		double radio = Double.parseDouble(valUsuario);
		JOptionPane.showMessageDialog(null, "El área del círculo es :"+(PI*(Math.pow(radio, 2))));
	}

}
