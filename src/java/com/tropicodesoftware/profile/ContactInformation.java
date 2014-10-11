/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.profile;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Anthony
 * @Responsiblity:
 * -serve as a collection of an entity's contact information
 */


public class ContactInformation implements Serializable{
    private ArrayList<Telephone> contactNumbers;
    private ArrayList<Email> emailAddresses;

    public ArrayList<Telephone> getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(ArrayList<Telephone> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    public ArrayList<Email> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(ArrayList<Email> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }
    
}
