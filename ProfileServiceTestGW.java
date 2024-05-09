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

 // Implememnting mockito

 // Imports 
 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.assertEquals;
 import static org.mockito.Mockito.mock;
 import static org.mockito.Mockito.when;
 
 public class ProfileServiceTestGW {
    
     @Test
     public void testCreateProfile() {
         // Arrange
         ProfileGW expectedProfile = new Profile("Advanced", "Asian");
         ProfileServiceGW profileServiceMock = mock(ProfileService.class);
         when(profileServiceMock.createProfile("Advanced", "Asian")).thenReturn(expectedProfile);
 
         // Act
         ProfileGW profile = profileServiceMock.createProfile("Advanced", "Asian");
 
         // Assert
         assertEquals(expectedProfile.getExperienceLevel(), profile.getExperienceLevel());
         assertEquals(expectedProfile.getCulturalPreference(), profile.getCulturalPreference());
     }
 
     @Test
     public void testSaveDifficultyLevel() {
         // Arrange
         Profile profile = new Profile("Advanced", "Asian");
         String expectedDifficultyLevel = "Expert";
         ProfileService profileServiceMock = mock(ProfileService.class);
 
         // Act
         profileServiceMock.saveDifficultyLevel(profile, expectedDifficultyLevel);
 
         // Assert
         assertEquals(expectedDifficultyLevel, profile.getDifficultyLevel());
     }
 }
 