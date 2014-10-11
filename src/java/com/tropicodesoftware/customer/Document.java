/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.customer;

import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Anthony
 */
public class Document implements Serializable{
    
    @NotNull
    private List<byte[]> documentSheets;
    @NotNull
    private String documentType;
    private String description;
            
    public List<byte[]> getDocumentSheets() {
        return documentSheets;
    }

    public void setDocumentSheets(List<byte[]> documentSheets) {
        this.documentSheets = documentSheets;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
