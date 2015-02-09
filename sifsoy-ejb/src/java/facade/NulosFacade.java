/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entities.Nulos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Martha
 */
@Stateless
public class NulosFacade extends AbstractFacade<Nulos> {
    @PersistenceContext(unitName = "sifsoy-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NulosFacade() {
        super(Nulos.class);
    }
    
}
