/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SecondaryTable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Anthony
 */
@Entity
@SecondaryTable(name = "SIGNATURES")
public class PersonalCustomer extends Customer {
    
    @NotNull
    String firstName;
    String otherNames;
    @NotNull
    String lastName;
    @NotNull 
    @Column(table = "SIGNATURES")
    Signature signature;
    
    @Override
    public String getName(){
        String name;
        if (otherNames != null) name = firstName + " " + otherNames + " " + lastName;
        else name = firstName + " " + lastName; 
        return name;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }
    
}
