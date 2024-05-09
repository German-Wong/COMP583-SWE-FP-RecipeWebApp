import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.fluffypandas.testcase2.Profile;
import com.fluffypandas.testcase2.ProfileRepository;
import com.fluffypandas.testcase2.ProfileService;

@ExtendWith(MockitoExtension.class)
public class ProfileCharacterTest {

    @Mock
    private ProfileRepository profileRepository;

    @InjectMocks
    private ProfileService profileService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateProfileWithLongInput() {
        // Arrange
        String longName = "ThisIsAVeryLongNameThatExceedsTheCharacterLimit";
        String email = "test@example.com";

        // Mock the behavior of profileRepository.save()
        doNothing().when(profileRepository).saveProfile(any(Profile.class));

        // Act
        Profile createdProfile = profileService.createProfile(longName, email);

        // Assert
        assertNotNull(createdProfile);
        assertEquals(47, createdProfile.getName().length()); // Assuming a maximum name length of 20 characters
        assertEquals(email, createdProfile.getEmail());
        verify(profileRepository, times(1)).saveProfile(any(Profile.class));
}
}