/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import entities.Jrvs;
import entities.Sectoreselectorales;
import facade.JrvsFacade;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Martha
 */
@Named(value = "jrvBean")
@RequestScoped
public class JrvBean {
    @EJB
    private JrvsFacade jrvsFacade;
    private Jrvs jrv = new Jrvs();
    private List<Jrvs> jrvList = new ArrayList<>();
    
   /* @ManagedProperty(value = "#{param.id}")
    private Integer id;

    public Integer getId() {
        return id;
    }
    /**
     * Creates a new instance of JrvBean
     */
    public JrvBean() {
       // id = 1;
    }
    
    public List<Jrvs> getJrvList()
    {
        Sectoreselectorales sector  = new Sectoreselectorales();
        
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
        int id = Integer.parseInt(paramMap.get("id"));
        sector.setIdsectorelectoral(id);
        
        jrvList = jrvsFacade.getJrvsBySector(sector);
        return jrvList;
    }
}
