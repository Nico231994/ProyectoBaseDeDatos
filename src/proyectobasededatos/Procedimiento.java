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
public class Procedimiento implements IProcedimiento{
    
    private String id;
    private String id_mascota;
    private String ci_veterinario;
    private String rut_veterinaria;
    private String tipo;
    private int costo;
    private String descripcion;
    private String fecha;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getCi_veterinario() {
        return ci_veterinario;
    }

    public void setCi_veterinario(String ci_veterinario) {
        this.ci_veterinario = ci_veterinario;
    }

    public String getRut_veterinaria() {
        return rut_veterinaria;
    }

    public void setRut_veterinaria(String rut_veterinaria) {
        this.rut_veterinaria = rut_veterinaria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Procedimiento(String id, String id_mascota, String ci_veterinario, String rut_veterinaria, String tipo, int costo, String descripcion, String fecha) {
        this.id = id;
        this.id_mascota = id_mascota;
        this.ci_veterinario = ci_veterinario;
        this.rut_veterinaria = rut_veterinaria;
        this.tipo = tipo;
        this.costo = costo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

}
