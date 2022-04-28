package zooAnimales;

import java.util.ArrayList;

import gestion.*;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<Zona>();
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		totalAnimales++;
	}
	
	public Animal() {
		totalAnimales++;
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos()+"\n"+
				"Aves: " + Ave.cantidadAves()+"\n"+
				"Reptiles: " + Reptil.cantidadReptiles()+"\n"+
				"Peces: " + Pez.cantidadPeces()+"\n"+
				"Anfibios: " + Anfibio.cantidadAnfibios();
	}
	
	@Override
	public String toString() {
		String formato, patron;
		if(zona.size() == 1) {
			patron = "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s, la zona en la que me ubico es %s, en el %s";
			formato = String.format(patron, nombre, edad, habitat, genero, zona.get(0).getNombre(),zona.get(0).getZoo().getNombre());
			return formato;
		}else {
			patron = "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s";
			formato = String.format(patron, nombre, edad, habitat, genero);
			return formato;
		}
	}
	
	public String movimiento() {
		return "desplazarse";
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
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

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona.add(zona);
	}
}