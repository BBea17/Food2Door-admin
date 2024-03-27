/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prl.food2door.admin;

/**
 *
 * @author TI
 */
public class Comida {
    private String nombre;
    private Double precio;
    private int imagen;
    private Restaurante restaurante;

    public Comida(String nombre, Double precio, int imagen/*, Restaurante restaurante*/) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
       /* this.restaurante = restaurante*/;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

   /* public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }*/

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
