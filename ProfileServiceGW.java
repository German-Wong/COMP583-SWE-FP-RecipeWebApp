/* 
 * German Wong 
 * 
 * Test Case #41:
 * User fills in the experience level as "Advanced" and cultural preferences as "Asian". 
 * The profile is successfully created with the chosen experience level and cultural 
 * preferences saved, and the user is redirected to their profile page.
 * 
 * 
 * Test Case #31:
 * User chooses the difficulty level they want for the dishes
 */

// Running the test

// Short method to set the eperience level and cultural preference 

public class ProfileServiceGW {
    public Profile createProfile(String experienceLevel, String culturalPreference) {
        // Simulate profile creation logic
        Profile profile = new Profile(experienceLevel, culturalPreference);
        // Redirect to profile page
        return profile;
    }


    // Setting dificulty level from easy, medium, hard

    public void saveDifficultyLevel(Profile profile, String difficultyLevel) {
        // Simulate saving difficulty level to profile
        profile.setDifficultyLevel(difficultyLevel);
    }
}

