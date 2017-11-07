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
public class Veterinario implements IPersonas{
     private String ci;
    private String nombre;
    private String apellido;
    private String f_nac;
    private String email;
    private String celular;

    @Override
    public String getCi() {
        return ci;
    }

    @Override
    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getF_nac() {
        return f_nac;
    }

    @Override
    public void setF_nac(String f_nac) {
        this.f_nac = f_nac;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getCelular() {
        return celular;
    }

    @Override
    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Veterinario(String ci, String nombre, String apellido, String f_nac, String email, String celular) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.f_nac = f_nac;
        this.email = email;
        this.celular = celular;
    }
   
    
}
