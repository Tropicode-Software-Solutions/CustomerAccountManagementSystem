/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.customer;

import com.tropicodesoftware.profile.Address;
import com.tropicodesoftware.profile.ContactInformation;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.SecondaryTable;

/**
 *
 * @author Anthony
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SecondaryTable(name = "DOCUMENTS")
public abstract class Customer implements Serializable{
    @Id
    private String customerId;
    private Address address;
    private ContactInformation contactInfo;
    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Account> accounts;
    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Product> products;
    @Column(table = "DOCUMENTS")
    private List<Document> documents;
    
    public abstract String getName(); 
    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactInformation getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInformation contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
    
}
