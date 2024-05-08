import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class profileCreation {

    //This function is used to check whether the first and last name have special characters
    public static String fNameLName(String fName, String lName) {
        int count = 0; //Going to be used to check whether there is a special character or not

        //Loop is used to run through entire string to check for special characters. If special character is found, add 1 to count
        for(int i = 0; i < fName.length(); i++) {
            if(!Character.isDigit(fName.charAt(i)) && !Character.isLetter(fName.charAt(i)) && !Character.isWhitespace(fName.charAt(i))) {
                count++;
            }
        }
        //If count is not 0, print failure message
        if (count != 0) {
            return "Account failed to create. No special characters in first name.";
        }
        else {
            //Same thing as above for loop, except this time for last name
            for(int i = 0; i < lName.length(); i++) {
                if(!Character.isDigit(lName.charAt(i)) && !Character.isLetter(lName.charAt(i)) && !Character.isWhitespace(lName.charAt(i))) {
                    count++;
                }
            }
            if (count != 0) {
                return "Account failed to create. No special characters in last name.";
            }
            else {
                return "Account successfully created."; //Return account successfully created message
            }
        }

    }
}


