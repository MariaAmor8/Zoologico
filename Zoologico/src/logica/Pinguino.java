package logica;

public class Pinguino extends Animal{

	Pinguino(String nombre, int edad, String habitat) {
		super(nombre, edad, habitat);
	}

	@Override
	public String hacerSonido() {
		return "GLU GLU GLU";
	}
	

}
