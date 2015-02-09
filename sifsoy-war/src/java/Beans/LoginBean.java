/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import entities.Usuarios;
import facade.UsuariosFacade;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.log4j.Logger;

/**
 *
 * @author Martha
 */
public class LoginBean {
    
    private static Logger logger = Logger.getLogger(LoginBean.class);
    @EJB
    private UsuariosFacade usuariosFacade;
    private Usuarios currentUser;

    public Usuarios getCurrentUser() {
        
        if(currentUser == null)
        {
            currentUser = new Usuarios();
         //   currentUser.setPermisosusuariosList(new Permisos());
        }
        
        return currentUser;
    }

    public void setCurrentUser(Usuarios currentUser) {
        this.currentUser = currentUser;
    }
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }
    
    public String validarUsuario()
    {
        String outcome = "index?faces-redirect=true";
        
        try
        {
            Usuarios l = usuariosFacade.validarUsuario(getCurrentUser().getUsuario(), getCurrentUser().getPassword());
            
            if(l!= null)
            {
                outcome = "app/principal?faces-redirect=true";
            }
            else
            {
                FacesContext.getCurrentInstance().addMessage("Error al hacer login", new FacesMessage("Usuario/Contrasena invalido"));
            }
        }catch(Exception e)
        {
            logger.error("Error en el proceso de login: ", e);
        }
        
        return outcome;
    }
}
