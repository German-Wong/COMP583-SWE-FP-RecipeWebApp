package com.fluffypandas.testcase2;

public class ProfileService {
    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    // Create a new profile
    public Profile createProfile(String name, String email) {
        // Generate a unique profile ID (you can use UUID or any other method)
        String profileId = generateUniqueId();

        // Create the profile
        Profile profile = new Profile(profileId, name, email);

        // Save the profile
        profileRepository.saveProfile(profile);

        return profile;
    }

    private String generateUniqueId() {
        return "1234567";
    }
}