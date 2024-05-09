package com.fluffypandas.testcase2;

import java.util.HashMap;
import java.util.Map;

public class ProfileRepository {
    private final Map<String, Profile> profiles = new HashMap<>();

    // Save a profile
    public void saveProfile(Profile profile) {
        profiles.put(profile.getId(), profile);
    }

    // Retrieve a profile by ID
    public Profile getProfileById(String profileId) {
        return profiles.get(profileId);
    }


    // Other methods for updating, deleting, or querying profiles
}