/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.validation;

import java.util.ArrayList;
import java.util.Arrays;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author Anthony
 */
public class CountryExistsValidator implements ConstraintValidator<CountryExists, String>{
    ArrayList<String> listOfCountries;
    String[] countryList ={"ANTIGUA","BARBADOS","DOMINICA"};
    
    @Override
    public void initialize(CountryExists parameters){
        listOfCountries = new ArrayList<>();
        //empty array into collection
        listOfCountries.addAll(Arrays.asList(countryList));
    }
    
    @Override
    public boolean isValid(String country, ConstraintValidatorContext context){
        return listOfCountries.contains(country.toUpperCase()); 
    }
    
    
}
    
