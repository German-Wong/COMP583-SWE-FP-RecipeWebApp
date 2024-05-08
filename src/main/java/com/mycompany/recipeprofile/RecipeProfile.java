/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recipeprofile;

/**
 *
 * @author flore
 */
public class RecipeProfile {

    /**
     * Profile creating with weak password. 
     * The system should display an error message indicating that the password does not meet the required strength criteria.
     *      Weak passwords (e.g., fewer than 8 characters, common passwords).
     *      Passwords at the minimum acceptable length.
     * 
     * Profile creation with no numeric or special characters(Name/Last Name). 
     * Verify that no special characters are in the name or last name field. Should prompt for a message
     *      Invalid input data, numerical or special characters on name or last name.
     *      Special characters at any part of the fields specified. 
     * 
     */
   
    public static void main(String[] args) {
        Profile newProfile = new Profile();
        newProfile.Login();
    }
}
