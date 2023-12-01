package logica;

public abstract class Animal {
	private String nombre;
	private int edad;
	private String habitat;
	
	Animal(String nombre,int edad, String habitat){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat  =habitat;
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public String getHabitat() {
		return habitat;
	}

	public abstract String hacerSonido();
	
}
