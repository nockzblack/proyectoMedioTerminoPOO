package proyectoMedioTerminoPOO;

public class Deduccion {
												 // lowerLimit, fee, percentage
	private static final double tarifaCalc[][] = {{0.01, 0.00, 1.92}, 
												  {5,952.85, 114.29, 6.40}, 
												  {50,524.93, 2,966.91, 10.88}, 
												  {88,793.05, 7,130.48, 16.00}, 
												  {103,218.01, 9,438.47, 17.92}, 
												  {123,580.21, 13,087.37, 21.36}, 
												  {249,243.49, 39,929.05, 23.52}, 
												  {392,841.97, 73,703.41, 30.00}, 
												  {750,000.01, 180,850.82, 32.00}, 
												  {1,000,000.01, 260,850.81, 34.00}, 
												  {3,000,000.01, 940,850.81, 35.00}};
	private Persona personaADeducir;
	
	public Deduccion() {
		personaADeducir = new Persona();
	}
	
}
