import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class testProfileCreation {
    @DisplayName("Checking for special characters in first name and last name.")
    @Test
    void testFNameLName() {
        assertSame("Account failed to create. No special characters in first name.", profileCreation.fNameLName("al$", "bob"));
        System.out.println("Test case with special characters in first name works!");

        assertSame("Account failed to create. No special characters in last name.", profileCreation.fNameLName("alek", "bo$$"));
        System.out.println("Test case with special characters in last name works!");

        assertSame("Account successfully created.", profileCreation.fNameLName("alek", "bob"));
        System.out.println("Test case with no special characters in first or last name works!");
    }
}
