/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recipeprofile;

/**
 *
 * @author flores
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
    
    
    
    public void Login(){
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
                System.out.println("Invalid password. Password should have at least 8 characters and not be a common password.");
                    }
            if(isValidName(Name,LastName)){
                isValidName = true; 
               
                }
            else{
                System.out.println("Invalid Name/Last Name. Special Characters are not allowed in Name or Last Name");
                System.out.println("\nEnter name: ");
                Name = user.nextLine();
                System.out.println("Enter Last Name: ");
                LastName = user.nextLine();
            }
            
            }
            
        
 
            accounts.put(Username,new String []{Name, LastName, password});
            
    
    }
    
    public void SignIn(){
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
    
    public static boolean isValid(String password){
        return password.length()>= 8 && !isCommonPassword(password);
    }
    
    public static boolean isCommonPassword(String password){
        return password.equals("password1")||password.equals("password2");
    }
    public static boolean isValidName(String name,String lastname){
        if(name.matches(regex)|| lastname.matches(regex)){
            return false;
                }
            else{
                return true;
                }
    }
}
    
    
    

    

