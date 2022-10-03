import javax.swing.JOptionPane;
public class ex3app {

	public static void main(String[] args) {
		/*Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).*/
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Bienvendido/a: "+nombre);
	}

}
