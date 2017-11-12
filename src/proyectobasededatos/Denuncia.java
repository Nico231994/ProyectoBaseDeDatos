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
public class Denuncia implements IDenuncia {
    private String id;
    private String tipo;
    private String fecha;
    private String direccion;
    private boolean encontrado;
    private String ci_Persona;
    private String ci_veterinario;
    private String id_mascota;

    Denuncia(String ci, String ci_Vet) {
        this.ci_Persona = ci;
        this.ci_veterinario = ci_Vet;
    }

    public String getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getFecha() {
        return fecha;
    }

    @Override
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean isEncontrado() {
        return encontrado;
    }

    @Override
    public void setEncontrado(boolean encontrado) {
        this.encontrado = encontrado;
    }

    @Override
    public String getCi_Persona() {
        return ci_Persona;
    }

    @Override
    public void setCi_Persona(String ci_Persona) {
        this.ci_Persona = ci_Persona;
    }

    @Override
    public String getCi_veterinario() {
        return ci_veterinario;
    }

    @Override
    public void setCi_veterinario(String ci_veterinario) {
        this.ci_veterinario = ci_veterinario;
    }

    public Denuncia(String id, String tipo, String fecha, String direccion, boolean encontrado, String ci_Persona, String ci_veterinario) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.direccion = direccion;
        this.encontrado = encontrado;
        this.ci_Persona = ci_Persona;
        this.ci_veterinario = ci_veterinario;
    }
    
    
}
