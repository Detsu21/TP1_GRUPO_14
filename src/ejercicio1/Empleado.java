package ejercicio1;

public class Empleado extends Persona{
	private int legajo;
	private String puesto;
	
	public Empleado() {
		super();
	}
	
	public int getLegajo() {
		return legajo;
	}
	
	public String getPuesto() {
		return puesto;
	}

	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", puesto=" + puesto + "]";
	}
	
}
