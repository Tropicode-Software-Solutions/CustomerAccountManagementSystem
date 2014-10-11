/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.customer;

import com.tropicodesoftware.util.AbstractFacade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Anthony
 */

@Stateless
public class ProductFacade extends AbstractFacade{
    @PersistenceContext(unitName = "CustomerAccountManagementSystemPU")
    private EntityManager em;
    
    public ProductFacade(){
        super(Product.class);
    }
    
    @Override
    protected EntityManager getEntityManager(){
        return em;
    }
}
    

