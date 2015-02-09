/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entities.Usuarios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Martha
 */
@Stateless
public class UsuariosFacade extends AbstractFacade<Usuarios> {
    @PersistenceContext(unitName = "sifsoy-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosFacade() {
        super(Usuarios.class);
    }
    
       public Usuarios validarUsuario(String usuario, String password)
    {
        Usuarios user = null;
        
        try 
        {
            Query query = getEntityManager().createQuery("SELECT u FROM Usuarios u WHERE u.usuario = :usuario and u.password = :password");
            query.setParameter("usuario", usuario);
            query.setParameter("password", password);
            
            user = (Usuarios) query.getSingleResult();
            
            if(user != null)
            {
                getLogger().info("Usuario encontrado: " +  usuario);
            }
        }
        catch (Exception e)
        {
            getLogger().error("Error al validar el usuario: " + usuario + ": " , e); 
        }
        
        return user;
    }
}
