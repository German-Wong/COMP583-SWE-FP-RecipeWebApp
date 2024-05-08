import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
public class ProfileTest {

    // Tests to assure system prevents profile creating with an existing email
    @After
    public void clearEmails(){
        Profile.deleteExistingEmails();
    }

    @Test
    public void testExistingEmailThrowsError() {
        String email = "aa@gmail.com";
        new Profile("Jasmine A", 22, email); 
        new Profile("Diana A", 28, email); 
    }
    @Test
    public void testNonExistingEmailPasses() {
        String email1 = "a@gmail.com";
        String email2 = "b@gmail.com";
        Profile profile1 = new Profile("Diana A", 28, email1); 
        Profile profile2 = new Profile("Jasmine", 22, email2); 
        assertEquals(email1, profile1.getEmail());
        assertEquals(email2, profile2.getEmail());
    }


    // Tests to assure profile can not be created with any empty fields
    @Test
    public void testCreateProfile() {
        String name = "arturo a";
        int age = 50;
        String email = "arturo@test.com";
        Profile profile = new Profile(name, age, email);
        assertEquals(name, profile.getName());
        assertEquals(age, profile.getAge());
        assertEquals(email, profile.getEmail());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyName() {
        new Profile("", 30, "arturo@test.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyEmail() {
        new Profile("Arturo A", 50, "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAllEmptyFields() {
        new Profile("", 50, "");
    }
}
