/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.customer;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Anthony
 */
@Entity
public class Account implements Serializable{
    
    @Id 
    private int accountNumber;
    @NotNull
    @Enumerated(EnumType.STRING)
    private AccountOffering accountType;
    @NotNull
    @ManyToMany(mappedBy = "accounts", fetch = FetchType.LAZY)
    private Set<Customer> owners;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Product> products;
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountOffering getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountOffering accountType) {
        this.accountType = accountType;
    }

    public Set<Customer> getOwners() {
        return owners;
    }

    public void setOwners(Set<Customer> owners) {
        this.owners = owners;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    
}
