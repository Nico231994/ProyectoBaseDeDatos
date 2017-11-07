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
public interface IPersonas {
    
    
    public String getCi() ;

    public void setCi(String ci);

    public String getNombre() ;

    public void setNombre(String nombre);

    public String getApellido() ;

    public void setApellido(String apellido);
    public String getF_nac();

    public void setF_nac(String f_nac);

    public String getEmail();

    public void setEmail(String email);

    public String getCelular();

    public void setCelular(String celular) ;
}
