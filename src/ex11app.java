import javax.swing.JOptionPane;
public class ex11app {

	public static void main(String[] args) {
		/*Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.*/
		String dia = JOptionPane.showInputDialog("Introduce un día de la semana:");
		dia.toLowerCase();
		switch (dia) {
		case "lunes":
			System.out.println("Es laborable");
		break;
		case "martes":
			System.out.println("Es laborable");
		break;
		case "miercoles":
			System.out.println("Es laborable");
		break;
		case "jueves":
			System.out.println("Es laborable");
		break;
		case "viernes":
			System.out.println("Es laborable");
		break;
		case "sábado":
			System.out.println("Es festivo");
		break;
		case "domingo":
			System.out.println("Es festivo");
		break;

		}
	}

}
