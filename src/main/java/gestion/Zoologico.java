package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {
		
	}
	public Zoologico(String nombre, String ubicacion) {
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);
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

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	
	public int cantidadTotalAnimales() {
		int cantidad = 0;
		for(int i=0;i < zonas.size(); i++) {
			cantidad += zonas.get(i).cantidadAnimales();
		}
		
		return cantidad;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	
}