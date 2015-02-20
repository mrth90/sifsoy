/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entities.Jrvs;
import entities.Sectoreselectorales;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Martha
 */
@Stateless
public class JrvsFacade extends AbstractFacade<Jrvs> {
    @PersistenceContext(unitName = "sifsoy-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JrvsFacade() {
        super(Jrvs.class);
    }
    
    /**
     *
     * @param idsector
     * @return
     */
    public List<Jrvs> getJrvsBySector(Sectoreselectorales sector)
    {
        TypedQuery<Jrvs> query = em.createNamedQuery("Jrvs.findByIdSector", Jrvs.class).setParameter("idsectorelectoral", sector);
        return query.getResultList();
    }
}
