/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.profile;

import com.tropicodesoftware.validation.EmailFormat;
import java.io.Serializable;

/**
 *
 * @author Anthony
 * @Responsibility:
 * -serve as a representation of an email address
 */

public class Email implements Serializable{
    @EmailFormat
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    
}
