package zooAnimales;

import gestion.*;
import java.util.ArrayList;

public class Pez extends Animal {
   private static ArrayList<Pez> listado = new ArrayList();
   public static int salmones = 0;
   public static int bacalaos = 0;
   private String colorEscamas;
   private int cantidadAletas;

   public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
      super.nombre = nombre;
      super.edad = edad;
      super.habitat = habitat;
      super.genero = genero;
      super.zona = zona;
      this.colorEscamas = colorEscamas;
      this.cantidadAletas = cantidadAletas;
      listado.add(this);
   }

   public Pez() {
      listado.add(this);
   }

   public int getSalmones() {
      return salmones;
   }

   public int getBacalaos() {
      return bacalaos;
   }

   public String getColorEscamas() {
      return this.colorEscamas;
   }

   public int getCantidadAletas() {
      return this.cantidadAletas;
   }

   public ArrayList<Pez> getListado() {
      return listado;
   }

   public void setColorEscamas(String colorEscamas) {
      this.colorEscamas = colorEscamas;
   }

   public void setCantidadAletas(int cantidadAletas) {
      this.cantidadAletas = cantidadAletas;
   }

   public void crearSalmon(String nombre, int edad, String genero, Zona zona) {
      ++salmones;
      listado.add(new Pez(nombre, edad, "oceano", genero, zona, "gis", 6));
   }

   public void crearBacalao(String nombre, int edad, String genero, Zona zona) {
      ++bacalaos;
      listado.add(new Pez(nombre, edad, "oceano", genero, zona, "gris", 6));
   }

   static int cantidadPeces() {
      return listado.size();
   }

   public String movimiento() {
      return "nadar";
   }
}