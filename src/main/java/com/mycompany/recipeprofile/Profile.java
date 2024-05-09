/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recipeprofile;

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
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Profile {
    String Name;
    String Username;
    String LastName;
    String password;
    static String regex = ".*[^a-zA-Z ].*";
    
    Scanner user = new Scanner(System.in);
    
    Map<String, String[]> accounts = new HashMap<>();
    
     //I made a basic login function that allows a user to choose between Create Account and Login
    
    public void Login(){
        //I put some hardcoded accounts already to test the login in function and to use as a common password
        accounts.put("user1", new String[]{"John", "Doe", "password1"});
        accounts.put("user2", new String[]{"Jane", "Smith", "password2"});
        int x=0;
       while(x<3){
        System.out.println("\nWelcome to out Recipe app. Please choose an option below.");
        System.out.println("1. Create account");
        System.out.println("2. Login ");
        System.out.println("3. Exit Program");
            x = user.nextInt();
            user.nextLine();
            switch(x){
                case 1:
                    Creation();
                    break;
                case 2:
                    SignIn();
                    break;
                case 3:
                    x = 3;
                    break;
            }
        
        }
    }
    
    public void Creation(){
       
            //Here the user would input their username, name, last name, and password
            System.out.println("\nSign Up");
            System.out.println("Enter Username: ");
            Username = user.nextLine();
            System.out.println("Enter name: ");
            Name = user.nextLine();
            System.out.println("Enter Last Name: ");
            LastName = user.nextLine();
            
            boolean isValid = false;
            boolean isValidName = false;
            while (!isValid && !isValidName) {
            System.out.print("Enter password: ");
            password = user.nextLine();
            if (isValid(password)) {
                isValid = true;
                } 
            else {
                 //The prompt saying that the password they inputed is not valid
                System.out.println("Invalid password. Password should have at least 8 characters and not be a common password.");
                    }
            if(isValidName(Name,LastName)){
                isValidName = true; 
               
                }
            else{
                //The prompt saying that what they put under their name/last name is not valid and contains a special character
                System.out.println("Invalid Name/Last Name. Special Characters are not allowed in Name or Last Name");
                System.out.println("\nEnter name: ");
                Name = user.nextLine();
                System.out.println("Enter Last Name: ");
                LastName = user.nextLine();
            }
            
            }
            
        
            //saves newly created account so you can try to sign in again and it will work


            accounts.put(Username,new String []{Name, LastName, password});
            
    
    }
    
    public void SignIn(){
        //This is the sign in function
        System.out.println("\nSign In");
        System.out.println("Please enter your Username:");
        String signInUsername = user.nextLine();
        System.out.println("Please enter your Password: ");
        String signInPassword = user.nextLine();
        if (accounts.containsKey(signInUsername)) {
            String[] userInfo = accounts.get(signInUsername);
            if (userInfo[2].equals(signInPassword)) { // Password validation
                System.out.println("\nWelcome, " + userInfo[0] + " " + userInfo[1] + "!");
            } else {
                System.out.println("\nInvalid password.");
            }
        } else {
            System.out.println("\nUsername not found.");
        }
    }
    
    //This method checks if the password is valid by checking if it is long enough which the minimum is 8 characters long
    public static boolean isValid(String password){
        return password.length()>= 8 && !isCommonPassword(password);
    }
    
    //This method checks if the password is common. I defined common as a password that is already used/in the system since putting a method to get all common passwords would take too long
    public static boolean isCommonPassword(String password){
        return password.equals("password1")||password.equals("password2");
    }
    
    //This method checks if the name/last name is valid and does not have any special characters
    public static boolean isValidName(String name,String lastname){
        if(name.matches(regex)|| lastname.matches(regex)){
            return false;
                }
            else{
                return true;
                }
    }
}
    
    
    

    

