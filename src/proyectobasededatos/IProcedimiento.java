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
interface IProcedimiento {
    public String getId() ;

    public void setId(String id);

    public String getId_mascota();

    public void setId_mascota(String id_mascota);

    public String getCi_veterinario();

    public void setCi_veterinario(String ci_veterinario) ;

    public String getRut_veterinaria() ;

    public void setRut_veterinaria(String rut_veterinaria);

    public String getTipo() ;

    public void setTipo(String tipo) ;

    public int getCosto() ;

    public void setCosto(int costo) ;

    public String getDescripcion() ;

    public void setDescripcion(String descripcion);

    public String getFecha() ;

    public void setFecha(String fecha);
}
