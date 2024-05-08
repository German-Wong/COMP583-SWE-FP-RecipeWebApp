/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.recipeprofile;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 *
 * @author flores
 */
public class ProfileTest {
    
    

    public ProfileTest() {
        
    }
    
    /**
     * Test of Valid Password.
     */
    @Test
    public void testISValidPassword_ValidPassword() {
        String validPassword = "StrongPassword123";
        boolean isValid = Profile.isValid(validPassword);
        assertTrue(isValid);
    }

    /**
     * Test of Short Password.
     */
    @Test
    public void testIsValidPassword_TooShortPassword() {
        String shortPassword = "short";
        boolean isValid = Profile.isValid(shortPassword);
        assertFalse(isValid);
    }

    /**
     * Test of Common password.
     */
    @Test
    public void testIsValidPassword_CommonPassword() {
        String commonPassword ="password1";
        boolean isValid = Profile.isValid(commonPassword);
        assertFalse(isValid);
    }
    
    @Test
    public void testIsValidName_ValidName(){
        String ValidName = "Gold";
        String ValidLastName = "Roger";
        boolean isValidName = Profile.isValidName(ValidName,ValidLastName);
        assertTrue(isValidName);
    }
    
    @Test
    public void testIsValidName_InvalidName(){
        String InValidName = "R2D2";
        String ValidLastName = "Skywalker";
        boolean isValidName = Profile.isValidName(InValidName, ValidLastName);
        assertFalse(isValidName);
    }
    
    @Test
    public void testIsValidName_InvalidLastName(){
        String ValidName = "X";
        String InValidLastName = "23";
        boolean isValidName = Profile.isValidName(ValidName, InValidLastName);
        assertFalse(isValidName);
    }
    
    @Test
    public void testIsValidName_InvalidName_InvalidLastName(){
        String InValidName = "C3";
        String InValidLastName = "P0";
        boolean isValidName = Profile.isValidName(InValidName,InValidLastName);
        assertFalse(isValidName);
    }
    
}
