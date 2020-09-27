package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();

	public Zoologico() {
		this.nombre = null;
		this.ubicacion = null;
	}

	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int cantidadTotalAnimales() {

		return this.zonas.stream().mapToInt(z -> z.getAnimales().size()).sum();
	}

	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}
}
