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
public class mascota implements IMascota{
    private String id_chip;
    private String ci_duenio;
    private String nombre;
    private String peso;
    private boolean edad;

    public mascota(String id_chip, String ci_duenio, String nombre, String peso, boolean edad) {
        this.id_chip = id_chip;
        this.ci_duenio = ci_duenio;
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
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
    public String getPeso() {
        return peso;
    }

    @Override
    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public boolean isEdad() {
        return edad;
    }

    @Override
    public void setEdad(boolean edad) {
        this.edad = edad;
    }
    
    
}
