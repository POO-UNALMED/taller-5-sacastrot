package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;

	public Animal() {
		totalAnimales++;
	}

	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static String totalPorTipo() {

		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: "
				+ Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios();
	}

	public String movimiento() {
		return "desplazarse";
	}

	@Override
	public String toString() {
		String respuesta = String.format("Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s",
				this.getNombre(), this.getEdad(), this.getHabitat(), this.getGenero());
		if (this.getZona() != null) {
			respuesta += String.format(", la zona en la que me ubico es %s, en el %s", this.getZona(),
					this.getZona().getZoo());
		}
		return respuesta;
	}

}
