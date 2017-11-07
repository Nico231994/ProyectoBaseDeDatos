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
interface IDenuncia {
    public String getId() ;
    public void setId(String id);
    public String getTipo() ;
    public void setTipo(String tipo);
    public String getFecha() ;
    public void setFecha(String fecha) ;
    public String getDireccion() ;
    public void setDireccion(String direccion) ;
    public boolean isEncontrado() ;
    public void setEncontrado(boolean encontrado);
    public String getCi_Persona() ;
    public void setCi_Persona(String ci_Persona) ;
    public String getCi_veterinario();
    public void setCi_veterinario(String ci_veterinario) ;
}
