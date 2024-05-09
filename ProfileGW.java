/* 
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

 public class ProfileGW {

    //Things we're testing for
    private String experienceLevel;
    private String culturalPreference;
    private String difficultyLevel;

    // Sets experience and cultural preference
    public Profile(String experienceLevel, String culturalPreference) {
        this.experienceLevel = experienceLevel;
        this.culturalPreference = culturalPreference;
    }

    // returns experience level
    public String getExperienceLevel() {
        return experienceLevel;
    }
    // Sets experience level
    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
    // returns cultural preference
    public String getCulturalPreference() {
        return culturalPreference;
    }

    // sets cultural preference
    public void setCulturalPreference(String culturalPreference) {
        this.culturalPreference = culturalPreference;
    }

    // returns dificulty level
    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    // sets dificulty level
    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}