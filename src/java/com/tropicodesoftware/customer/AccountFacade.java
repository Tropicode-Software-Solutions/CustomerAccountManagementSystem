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
 * @Responsibilties:
 * - perform CRUD operations for the Account class
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account>{
    @PersistenceContext(unitName = "CustomerAccountManagementSystemPU")
    private EntityManager em;
    
    public AccountFacade(){
        super(Account.class);
    }
    
    @Override
    protected EntityManager getEntityManager(){
        return em;
    }
}
