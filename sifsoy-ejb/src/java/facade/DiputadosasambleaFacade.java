/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entities.Diputadosasamblea;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Martha
 */
@Stateless
public class DiputadosasambleaFacade extends AbstractFacade<Diputadosasamblea> {
    @PersistenceContext(unitName = "sifsoy-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiputadosasambleaFacade() {
        super(Diputadosasamblea.class);
    }
    
}
