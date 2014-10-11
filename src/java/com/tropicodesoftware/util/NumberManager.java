/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.util;

import com.tropicodesoftware.customer.AccountOffering;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Anthony
 */
@MappedSuperclass
@Singleton
//@Startup
@NamedQueries({
        @NamedQuery(name = "loadSavingsAccounts", query = "SELECT a.accountNumber FROM Account a WHERE a.accountType = com.tropicodesoftware.customer.AccountOffering.SAVINGS"),
        @NamedQuery(name = "loadCheckingAccounts", query = "SELECT a.accountNumber FROM Account a WHERE a.accountType = com.tropicodesoftware.customer.AccountOffering.CHECKING"),
        @NamedQuery(name = "loadLoanAccounts", query = "SELECT a.accountNumber FROM Account a WHERE a.accountType = com.tropicodesoftware.customer.AccountOffering.LOAN"),
        @NamedQuery(name = "loadCertificateAccounts", query = "SELECT a.accountNumber FROM Account a WHERE a.accountType = com.tropicodesoftware.customer.AccountOffering.CERTIFICATE_OF_DEPOSIT"),
        @NamedQuery(name = "loadCreditCardAccounts", query = "SELECT a.accountNumber FROM Account a WHERE a.accountType = com.tropicodesoftware.customer.AccountOffering.CREDIT_CARD"),
        @NamedQuery(name = "loadCollateralAccounts", query = "SELECT a.accountNumber FROM Account a WHERE a.accountType = com.tropicodesoftware.customer.AccountOffering.COLLATERAL")
})
public class NumberManager {
    List<Integer> savingsAccountCache;
    List<Integer> checkingAccountCache;
    List<Integer> loanAccountCache;
    List<Integer> certificateAccountCache;
    List<Integer> creditCardAccountCache;
    List<Integer> collateralAccountCache;
    
    @PersistenceContext(unitName = "CustomerAccountManagementSystemPU")
    EntityManager em;
    
    @PostConstruct
    void init(){   
        TypedQuery <Integer> query;
        
        query = em.createNamedQuery("loadSavingsAccounts", Integer.class);
        savingsAccountCache = query.getResultList();
        query = em.createNamedQuery("loadCheckingAccounts", Integer.class);
        checkingAccountCache = query.getResultList();
        query = em.createNamedQuery("loadLoanAccounts", Integer.class);
        loanAccountCache = query.getResultList();
        query = em.createNamedQuery("loadCertificateAccounts", Integer.class);
        certificateAccountCache = query.getResultList();
        query = em.createNamedQuery("loadCreditCardAccounts", Integer.class);
        creditCardAccountCache = query.getResultList();
        query = em.createNamedQuery("loadCollateralAccounts", Integer.class);
        collateralAccountCache = query.getResultList();
       
    }
    
    private List<Integer> chooseList(AccountOffering accType){
        List<Integer> accountList;
        switch (accType){
            case SAVINGS: accountList = savingsAccountCache; break;
            case CHECKING: accountList = checkingAccountCache; break;
            case LOAN: accountList = loanAccountCache; break;
            case CERTIFICATE_OF_DEPOSIT: accountList = certificateAccountCache; break;
            case CREDIT_CARD: accountList = creditCardAccountCache; break;
            case COLLATERAL: accountList = collateralAccountCache; break;  
            default: accountList = new ArrayList<>();
            }
        return accountList;
        }
    
    
    public int generateAccountNumber(AccountOffering accType){
        List<Integer> accountList = chooseList(accType);
        Integer nextAccountNumber;
        //if the list is not empty
        if (!(accountList.isEmpty())) {
            //find the last account number in the list and add one to its value
            nextAccountNumber = accountList.get(accountList.size() - 1);
            nextAccountNumber++;
        }
        //if the list is empty, use the beginning number for this type of account
        else nextAccountNumber = accType.getBegNumber();
        //add the generated number to the cache so that it is not accidentally reused
        accountList.add(nextAccountNumber);
        return nextAccountNumber;
    }

}
