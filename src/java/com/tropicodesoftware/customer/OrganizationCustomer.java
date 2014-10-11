/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.customer;

import java.util.Set;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Anthony
 */
@Entity
public class OrganizationCustomer extends Customer{
    @NotNull
    private Set<Customer> members;
    @NotNull
    private String Name;
    
    public Set<Customer> getMembers() {
        return members;
    }

    public void setMembers(Set<Customer> members) {
        this.members = members;
    }

    @Override
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
     
}
