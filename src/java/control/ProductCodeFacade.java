/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modeles.ProductCode;

/**
 *
 * @author Arthur
 */
@Stateless
public class ProductCodeFacade extends AbstractFacade<ProductCode> {

    @PersistenceContext(unitName = "ProjetJ2EEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductCodeFacade() {
        super(ProductCode.class);
    }
    
}
