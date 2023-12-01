package logica;

public class Leon extends Animal{

	public Leon(String nombre, int edad, String habitat) {
		super(nombre, edad, habitat);
	}

	@Override
	public String hacerSonido() {
		return "RRRRR!!";
	}
	

}
