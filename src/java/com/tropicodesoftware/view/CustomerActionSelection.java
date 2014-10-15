/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.view;

import javax.enterprise.context.RequestScoped;
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
    
 
    public String createNewCustomer(String type){
        //based on which string is returned the next page is called 
        switch (type) {
            case "person":
                return "createNewPersonal";
            case "org":
                return "createNewOrganization";
            default: return null;
        }
    }
}
