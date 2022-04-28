package gestion;

import java.util.ArrayList;

public class Zoologico {
   private String nombre;
   private String ubicacion;
   private ArrayList<Zona> zonas = new ArrayList();
   public static int n_zonas = 0;

   public Zoologico(String nombre, String ubicacion) {
      this.nombre = nombre;
      this.ubicacion = ubicacion;
      ++n_zonas;
   }

   public Zoologico() {
   }

   public String getNombre() {
      return this.nombre;
   }

   public String getUbicacion() {
      return this.ubicacion;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public void setUbicacion(String ubicacion) {
      this.ubicacion = ubicacion;
   }

   public void agregarZonas(Zona zona) {
      this.zonas.add(zona);
   }

   public int cantidadTotalAnimales() {
      int cantidadAnimales = 0;

      for(int i = 0; i < this.zonas.size(); ++i) {
         cantidadAnimales += ((Zona)this.zonas.get(i)).cantidadAnimales();
      }

      return cantidadAnimales;
   }
}
