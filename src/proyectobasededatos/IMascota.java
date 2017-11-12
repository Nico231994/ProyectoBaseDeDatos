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
interface IMascota {
    
    public String getId_chip();
    
    public void setId_chip(String id_chip);

    public String getCi_duenio();

    public void setCi_duenio(String ci_duenio);

    public String getNombre();

    public void setNombre(String nombre);

    public int getPeso();

    public void setPeso(int peso);
    
    public String getEdad();
    
    public void setEdad(String edad);
    
    
    
}
