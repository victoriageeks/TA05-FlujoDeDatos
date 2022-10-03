import javax.swing.JOptionPane;
public class ex5app {

	public static void main(String[] args) {
		/*Lee un número por teclado e indica si es divisible entre 2 (resto=0). Si no lo es, también debemos indicarlo.*/
		
		String valUsuario = JOptionPane.showInputDialog("Introduce un número:");
		double numero = Double.parseDouble(valUsuario);
		if (numero%2==0)
			JOptionPane.showMessageDialog(null, "El número introducido es divisible entre 2!");
		else
			JOptionPane.showMessageDialog(null, "El número introducido no es divisible entre 2.");
	}

}
