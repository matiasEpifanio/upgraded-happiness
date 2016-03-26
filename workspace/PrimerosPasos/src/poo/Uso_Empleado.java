package poo;
import java.util.*;
import java.lang.Math;

public class Uso_Empleado{
	
	public static void main(String[] args){
		
		Empleado empleado1 = new Empleado("Matias", 11000, 1991, 6, 29);
		
		Empleado empleado2 = new Empleado("Eduardo", 15000, 2000, 5, 20);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(Math.PI);
		
		System.out.println(empleado1.dameSueldo() + " " + empleado2.dameSueldo() + " " + empleado1.dameFechaContrato() + " " + empleado2.dameFechaContrato());

	}
	
}

class Empleado{
	
	public Empleado(String nom, double sue, int anio, int mes, int dia){
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		altaContrato=calendario.getTime();
	}
	
	public Empleado(String nom){
		nombre=nom;
	}
	
	public String dameNombre(){ // GETTER.
		return nombre;
	}
	
	public double dameSueldo(){ // GETTER.
		return sueldo;
	}
	
	public Date dameFechaContrato(){ // GETTER.
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje){ // SETTER
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato; // Tipo Objeto. Date.
	
	
}
