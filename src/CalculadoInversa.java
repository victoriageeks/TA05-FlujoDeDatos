import javax.swing.JOptionPane;
public class CalculadoInversa {

	public static void main(String[] args) {
		/*Crea una aplicación llamada CalculadoInversa, nos pedirá 2 operadores (int) y un signo aritmético (String), según este último se realizará la operación correspondiente. Al final mostrará el resultado en un cuadro de diálogo.*/
		double resultado=0;
		String valUsuario1 = JOptionPane.showInputDialog("Introduce el primer operador:")
;
		double operador1 = Double.parseDouble(valUsuario1);
		
		String signoAritmetico = JOptionPane.showInputDialog("Introduce el signo aritmético:");
		
		String valUsuario2 = JOptionPane.showInputDialog("Introduce el segundo operador:");
		double operador2 = Double.parseDouble(valUsuario2);
		
		switch (signoAritmetico) {
		case "+":
			resultado=operador1+operador2;
			JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
			break;
		case "-":
			resultado=operador1-operador2;
			JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
			break;
		case "*":
			resultado=operador1*operador2;
			JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
			break;
		case "/":
			resultado=operador1/operador2;
			JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
			break;
		case "%":
			resultado=operador1%operador2;
			JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
			break;
			
		}
		
		
	}

}
