package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();

	public Zona() {
		super();
	}

	public Zona(String nombre, Zoologico zoo) {
		super();
		this.nombre = nombre;
		this.zoo = zoo;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarAnimales(Animal animal) {
		animales.add(animal);
		animal.setZona(this);
	}

	public int cantidadAnimales() {
		return animales.size();
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}
}
