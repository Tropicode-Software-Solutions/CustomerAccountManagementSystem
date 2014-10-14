/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.view;

import com.tropicodesoftware.customer.Customer;
import com.tropicodesoftware.customer.OrganizationCustomerFacade;
import com.tropicodesoftware.customer.PersonalCustomer;
import com.tropicodesoftware.customer.PersonalCustomerFacade;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Anthony
 */
@Named("CustomerFinder")
@SessionScoped
public class CustomerFinder implements Serializable{
    PersonalCustomerFacade pCustFacade;
    OrganizationCustomerFacade orgCustFacade;
    PersonalCustomer foundCustomer;
    Customer c;
    
    public boolean findPersonalCustomer(){
        //attempt to find the customer by its it
        Object returnValue = pCustFacade.find(c.getCustomerId());
        if (returnValue != null) foundCustomer = (PersonalCustomer)returnValue; 
        else return false;
        return true;
    }
}
