/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prl.food2door.admin;

import java.time.LocalTime;
import java.util.List;
import javafx.scene.image.Image;

/**
 *
 * @author TI
 */
public class Restaurante {
    private String nombre;
    private LocalTime horaApertura;
    private LocalTime horaCerrar;
    private int imagen;
    private List<Comida> productos;

    public Restaurante(String nombre, LocalTime horaApertura, LocalTime horaCerrar, int imagen, List<Comida> productos) {
        this.nombre = nombre;
        this.horaApertura = horaApertura;
        this.horaCerrar = horaCerrar;
        this.imagen = imagen;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalTime horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalTime getHoraCerrar() {
        return horaCerrar;
    }

    public void setHoraCerrar(LocalTime horaCerrar) {
        this.horaCerrar = horaCerrar;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public List<Comida> getProductos() {
        return productos;
    }

    public void setProductos(List<Comida> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
