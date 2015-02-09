/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entities.Resultadosalcaldia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Martha
 */
@Stateless
public class ResultadosalcaldiaFacade extends AbstractFacade<Resultadosalcaldia> {
    @PersistenceContext(unitName = "sifsoy-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResultadosalcaldiaFacade() {
        super(Resultadosalcaldia.class);
    }
    
}
