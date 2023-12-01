package logica;

import java.util.ArrayList;

public class Zoo {
	ArrayList<Animal> animales;
	
	public Zoo(){
		this.animales = new ArrayList<Animal>();
	}
	public Animal agrgarAnimal(String nombre, int edad, String habitat) {
		Animal animal;
		if(nombre.equals("leon")) {
			animal = new Leon(nombre, edad, habitat);
			this.animales.add(animal);
			return animal;
		}
		else if(nombre.equals("pinguino")) {
			animal = new Pinguino(nombre, edad, habitat);
			this.animales.add(animal);
			return animal;
		}
		else {
			return null;
		}
	}
}
