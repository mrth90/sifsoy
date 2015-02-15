/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import entities.Sectoreselectorales;
import facade.SectoreselectoralesFacade;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Martha
 */
@Named(value = "tableBean")
@RequestScoped
public class TableBean {
    
    @EJB
    private SectoreselectoralesFacade sectoreselectoralesFacade;
    private Sectoreselectorales sectores = new Sectoreselectorales();
    private List<Sectoreselectorales> sectoresList = new ArrayList<>();
    /**
     * Creates a new instance of TableBean
     */
    public TableBean() {
    }
    
    public List<Sectoreselectorales> getSectoresList()
    {
        /*List<Sectoreselectorales> listado;
        
        listado = sectoreselectoralesFacade.getSectoresList();
        
        return listado;*/
        
        sectoresList = sectoreselectoralesFacade.getSectoresList();
        return sectoresList;
    }
}
