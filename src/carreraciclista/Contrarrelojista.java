/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carreraciclista;

/**
 *
 * @author Sebastián
 */
class Contrarrelojista extends Ciclista {
   private double velocidadMáxima;


   public Contrarrelojista(int identificador, String nombre, double velocidadMáxima) {
       super(identificador, nombre);
       this.velocidadMáxima = velocidadMáxima;
   }


   protected double getVelocidadMáxima() {
       return velocidadMáxima;
   }


   protected void setVelocidadMáxima(double velocidadMáxima) {
       this.velocidadMáxima = velocidadMáxima;
   }


   protected void imprimir() {
       super.imprimir(); // Invoca el método imprimir de la clase padre
       System.out.println("Aceleración promedio = " + velocidadMáxima);
   }


   protected String imprimirTipo() {
       return "Es un constrarrelojista";
       }
  }

