/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.profile;

import com.tropicodesoftware.validation.NumericFormat;
import java.io.Serializable;
import javax.validation.constraints.Size;

/**
 *
 * @author Anthony
 * @Responsibility:
 * -serve as a representation of a telephone number
 */
public class Telephone implements Serializable{
    @Size(max = 19) @NumericFormat 
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
