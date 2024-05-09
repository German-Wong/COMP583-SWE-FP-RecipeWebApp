package com.fluffypandas.testcase1;

import java.time.LocalDate;

public class ProfileAge {
    public String createProfile(LocalDate userDob) {
        // Logic for profile creation
        if (isUserEligible(userDob)) {
            return "Profile created successfully!";
        } else {
            return "You are not allowed to create a profile as of now.";
        }
    }

    public boolean isUserEligible(LocalDate userDob) {
        LocalDate thirteenYearsAgo = LocalDate.now().minusYears(13);
        return userDob.isBefore(thirteenYearsAgo);
    }
}