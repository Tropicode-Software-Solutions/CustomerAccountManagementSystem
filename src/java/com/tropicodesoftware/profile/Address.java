/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.profile;

import com.tropicodesoftware.validation.CountryExists;
import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Anthony
 * @responsibiltiies:
 * - serve as a representation of an entity's address
 */
public class Address implements Serializable{
    
    //an address must contain at least one street level address and a country
    
    @NotNull
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    //a country must exist
    @CountryExists @NotNull
    private String country;
    private String zipcode;
    
    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    
}
