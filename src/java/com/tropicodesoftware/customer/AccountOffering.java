/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.customer;

/**
 *
 * @author Anthony
 */
public enum AccountOffering {
    SAVINGS(100010000),
    CHECKING(125000000),
    LOAN(215000000),
    CERTIFICATE_OF_DEPOSIT(150000000),
    CREDIT_CARD(410000000),
    COLLATERAL(230000000);
    private int begNumber;
    AccountOffering(int begNumber){
    this.begNumber = begNumber;
    }
    public int getBegNumber(){
        return this.begNumber;
    }
}
