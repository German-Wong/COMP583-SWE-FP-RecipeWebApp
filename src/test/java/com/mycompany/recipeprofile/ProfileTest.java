/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.recipeprofile;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 @author flores
    Test Case: 1

        Profile creation with weak password. The system should display an error message indicating that the password does not meet the required strength criteria.

    Class of Equivalence Partition:

        Weak passwords (e.g., fewer than 8 characters, common passwords).

    Boundary:

        Passwords at the minimum acceptable length.

    Test Case: 2

        Profile creation with no numeric or special characters(Name/Last Name). Verify that no special characters are in the name or last name field. Should prompt for a message

    Class of Equivalence Partition:

        Invalid input data, numerical or special characters on name or last name.

    Boundary:

        Special characters at any part of the fields specified.

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
