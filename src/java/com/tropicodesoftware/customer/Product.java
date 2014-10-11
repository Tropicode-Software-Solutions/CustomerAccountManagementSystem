/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.customer;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Anthony
 */
@Entity
public class Product implements Serializable{
    
    @Id @GeneratedValue
    private String productId;
    @NotNull
    @Enumerated(EnumType.STRING)
    private ProductOffering productType;
    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private Set<Account> linkedAccounts;
    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private Set<Customer> owners;
    
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductOffering getProductType() {
        return productType;
    }

    public void setProductType(ProductOffering productType) {
        this.productType = productType;
    }

    public Set<Account> getLinkedAccounts() {
        return linkedAccounts;
    }

    public void setLinkedAccounts(Set<Account> linkedAccounts) {
        this.linkedAccounts = linkedAccounts;
    }

    public Set<Customer> getOwners() {
        return owners;
    }

    public void setOwners(Set<Customer> owners) {
        this.owners = owners;
    }
    
    
}
