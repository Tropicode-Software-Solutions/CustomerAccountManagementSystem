/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.view;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Anthony
 */
@Named ("CustomerActionSelection")
@RequestScoped
public class CustomerActionSelection{
    
    public CustomerActionSelection(){
        
    }
    
    public String findExistingCustomer(){
        return "findExisting.xhtml";
    }
    
    public String createNewPersonalCustomer(){
        return "createNewPersonal";
    }
    
    public String createNewOrganizationCustomer(){
        return "createNewOrganization";
    }
}
