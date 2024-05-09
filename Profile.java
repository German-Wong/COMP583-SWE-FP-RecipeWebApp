import java.util.ArrayList;

public class Profile {
    private String name;
    private int age;
    private String email;
    private static ArrayList<String> existingEmails = new ArrayList<>();

    public Profile(String name, int age, String email) {
        if (name.isEmpty() || email.isEmpty()) {
            throw new IllegalArgumentException("Name and email cannot be empty");
        }
        if (existingEmails.contains(email)) {
            throw new IllegalArgumentException("Email is already in use");
        }
        this.name = name;
        this.age = age;
        this.email = email;
        existingEmails.add(email);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public static void deleteExistingEmails() {
        existingEmails.clear();
    }
}
