/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entities.Resultadosasamblea;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Martha
 */
@Stateless
public class ResultadosasambleaFacade extends AbstractFacade<Resultadosasamblea> {
    @PersistenceContext(unitName = "sifsoy-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResultadosasambleaFacade() {
        super(Resultadosasamblea.class);
    }
    
}
