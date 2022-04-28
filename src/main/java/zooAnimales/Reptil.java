package zooAnimales;

import gestion.*;
import java.util.ArrayList;

public class Reptil extends Animal {
   private static ArrayList<Reptil> listado;
   public static int iguanas = 0;
   public static int serpientes = 0;
   private String colorEscamas;
   private int largoCola;
   
   static {
       Reptil.listado = new ArrayList<Reptil>();
       Reptil.iguanas = 0;
       Reptil.serpientes = 0;
   }

   public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
      super.nombre = nombre;
      super.edad = edad;
      super.habitat = habitat;
      super.genero = genero;
      super.zona = zona;
      this.colorEscamas = colorEscamas;
      this.largoCola = largoCola;
      listado.add(this);
   }

   public Reptil() {
      listado.add(this);
   }

   public int getIguanas() {
      return iguanas;
   }

   public int getSerpientes() {
      return serpientes;
   }

   public String getColorEscamas() {
      return this.colorEscamas;
   }

   public int getLargoCola() {
      return this.largoCola;
   }

   public ArrayList<Reptil> getListado() {
      return listado;
   }

   public void setColorEscamas(String colorEscamas) {
      this.colorEscamas = colorEscamas;
   }

   public void setLargoCola(int largoCola) {
      this.largoCola = largoCola;
   }

   public void crearIguana(String nombre, int edad, String genero, Zona zona) {
      ++iguanas;
      listado.add(new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3));
   }

   public void crearSerpiente(String nombre, int edad, String genero, Zona zona) {
      ++serpientes;
      listado.add(new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1));
   }

   static int cantidadReptiles() {
      return listado.size();
   }

   public String movimiento() {
      return "reptar";
   }
}