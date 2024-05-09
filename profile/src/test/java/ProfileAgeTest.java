import org.junit.jupiter.api.Test;

import com.fluffypandas.testcase1.ProfileAge;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ProfileServiceTest {
    @Test
    void testCreateProfile_ValidDob() {
        // Arrange
        ProfileAge profileAge = new ProfileAge();
        LocalDate validDob = LocalDate.of(1990, 1, 1);

        // Act
        String result = profileAge.createProfile(validDob);

        // Assert
        assertEquals("Profile created successfully!", result);
    }

    @Test
    void testCreateProfile_TooYoung() {
        // Arrange
        ProfileAge profileAge = new ProfileAge();
        LocalDate tooYoungDob = LocalDate.now().minusYears(12);

        // Act
        String result = profileAge.createProfile(tooYoungDob);

        // Assert
        assertEquals("You are not allowed to create a profile as of now.", result);
    }

    @Test
    void testCreateProfile_MockitoExample() {
        // Arrange
        ProfileAge profileAge = mock(ProfileAge.class);
        LocalDate validDob = LocalDate.of(1995, 5, 10);
        when(profileAge.isUserEligible(validDob)).thenReturn(true);

        // Act
        String result = profileAge.createProfile(validDob);

        // Assert
        assertEquals("Profile created successfully!", result);
    }
}