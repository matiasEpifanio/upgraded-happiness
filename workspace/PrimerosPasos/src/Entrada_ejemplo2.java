import javax.swing.*;

public class Entrada_ejemplo2 {
	
	public static void main(String[] args) {
			
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad_usuario+1) + " años");
		
		double x=10000.0;
		System.out.printf("%1.2f", x/3);
		
		String num1=JOptionPane.showInputDialog("Introduce un Numero");	
		double num2=Double.parseDouble(num1);
		
		System.out.println("La raiz de " + num2 + " es ");
		System.out.printf("1,2f", Math.sqrt(num2));
	}
}
