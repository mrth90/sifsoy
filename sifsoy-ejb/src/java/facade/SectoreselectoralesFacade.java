/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entities.Sectoreselectorales;
import java.sql.ResultSet;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Martha
 */
@Stateless
public class SectoreselectoralesFacade extends AbstractFacade<Sectoreselectorales> {
    @PersistenceContext(unitName = "sifsoy-ejbPU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SectoreselectoralesFacade() {
        super(Sectoreselectorales.class);
    }
    
    /*public List<Sectoreselectorales> getSectoresList()
    {
        List<Sectoreselectorales> listado = null;
        
        try 
        {
            Query query = getEntityManager().createQuery("SELECT * FROM Sectoreselectorales");
            
            ResultSet result = (ResultSet) (Sectoreselectorales) query.getResultList();
            
            while(result.next())
            {
                Sectoreselectorales sect = new Sectoreselectorales();
                
                sect.setIdsectorelectoral(result.getInt("idsectorelectoral"));
                sect.setSectoreelectoral(result.getInt("sectoreelectoral"));
                sect.setCentrodevotacion(result.getString("centrodevotacion"));
                
                listado.add(sect);
            }
            
            if(listado != null)
            {
                getLogger().info("listado: " +  listado);
            }
        }
        catch (Exception e)
        {
            getLogger().error("Listado de sectores: " + listado + ": " , e); 
        }
        
        return listado;
    
    }*/
    
    public List<Sectoreselectorales> getSectoresList()
    {
        TypedQuery<Sectoreselectorales> query = em.createNamedQuery("Sectoreselectorales.findAll", Sectoreselectorales.class);
        return query.getResultList();
    }
}
