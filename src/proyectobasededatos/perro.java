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
public class perro extends mascota implements IMascota{
  
    private String id_chip;
    private String ci_duenio;
    private String nombre;
    private String peso;
    private boolean edad;
    

    

    public perro(String id_chip, String ci_duenio, String nombre, String peso, boolean edad) {
        
        super( id_chip,  ci_duenio,  nombre,  peso,  edad);
       
    }

    @Override
    public String getId_chip() {
        return id_chip;
    }

    @Override
    public void setId_chip(String id_chip) {
        this.id_chip = id_chip;
    }

    @Override
    public String getCi_duenio() {
        return ci_duenio;
    }

    public void setCi_duenio(String ci_duenio) {
        this.ci_duenio = ci_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public boolean isEdad() {
        return edad;
    }

    public void setEdad(boolean edad) {
        this.edad = edad;
    }
    
}
