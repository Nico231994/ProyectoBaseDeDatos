/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasededatos;

/**
 *
 * @author NicoPlaceres
 */
public class Mascota implements IMascota{
    private String id_chip;
    private String ci_duenio;
    private String nombre;
    private int peso;
    private int edad;

    public Mascota(String id_chip, String ci_duenio, String nombre, int peso, int edad) {
        this.id_chip = id_chip;
        this.ci_duenio = ci_duenio;
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    Mascota(String id_chip) {
       this.id_chip=id_chip;
    }

    Mascota(String id_ChipM, String nombre, int peso, int edad) {
        this.id_chip= id_ChipM;
        this.nombre = nombre;
        this.peso=peso;
        this.edad=edad;
    }

    public String getId_chip() {
        return id_chip;
    }

    public void setId_chip(String id_chip) {
        this.id_chip = id_chip;
    }

    public String getCi_duenio() {
        return ci_duenio;
    }

    public void setCi_duenio(String ci_duenio) {
        this.ci_duenio = ci_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public void setPeso(int peso) {
        this.peso = peso;
    }

  

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int getEdad() {
       return this.edad;
    }
    
    
}
