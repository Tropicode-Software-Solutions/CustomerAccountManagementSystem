/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.customer;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

/**
 *
 * @author Anthony
 */
public class Signature implements Serializable{
    
    private byte[] signatureImage;
    private Customer signatory;
    private Date dateCaptured;
            
    public byte[] getSignatureImage() {
        return signatureImage;
    }

    public void setSignatureImage(byte[] signatureImage) {
        this.signatureImage = signatureImage;
    }

    public Customer getSignatory() {
        return signatory;
    }

    public void setSignatory(Customer signatory) {
        this.signatory = signatory;
    }

    public Date getDateCaptured() {
        return dateCaptured;
    }

    public void setDateCaptured(Date dateCaptured) {
        this.dateCaptured = dateCaptured;
    }
    
}
