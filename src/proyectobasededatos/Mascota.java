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
    private String edad;
    private String tipo;
    private String raza;

    public Mascota(String id_chip, String ci_duenio, String nombre, int peso, String edad) {
        this.id_chip = id_chip;
        this.ci_duenio = ci_duenio;
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    Mascota(String id_chip) {
       this.id_chip=id_chip;
    }

    Mascota(String id_ChipM, String nombre, int peso, String edad) {
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
    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String getEdad() {
       return this.edad;
    }
    
    
}
