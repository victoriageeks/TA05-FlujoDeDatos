import javax.swing.JOptionPane;
public class ex12app {

	public static void main(String[] args) {
		/*Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la contraseña y mostrará un mensaje diciendo "enhorabuena". Piensa bien la codición de salida (3 intentos y si acierta sale, aunque le queden intentos).*/
		
		int intentos= 0;
		String claveCorrecta = "techma";
		boolean acierto = false;
		
		System.out.println(!acierto);
		for (intentos=0; intentos<=3 && !acierto; intentos++) {
			
			String claveUsuario = JOptionPane.showInputDialog("Introduce una contraseña:");
			
			if(claveUsuario.equals(claveCorrecta)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena!");
				acierto=true;
			}
		}
		
	}

}
