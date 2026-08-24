package ejercicio1;

public class Main {

	public static void main(String[] args) {
		// test de las distintas clases
		Empleado emp1 = new Empleado();
		Persona guy1 = new Persona();


		System.out.println(emp1.toString());
		System.out.println("El próximo legajo será el: " + emp1.devuelveProximoLegajo());

		Empleado emp2 = new Empleado();
		System.out.println(emp2.toString());

		System.out.println("El próximo legajo será el: " + emp2.devuelveProximoLegajo());
		System.out.println(guy1.toString());

		Empleado emp3 = new Empleado();
		System.out.println(emp3.toString());
		System.out.println("El próximo legajo será el: " + emp3.devuelveProximoLegajo());
	}

}
