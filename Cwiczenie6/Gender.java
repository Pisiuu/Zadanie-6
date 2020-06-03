package Cwiczenie6;

import org.springframework.stereotype.Component;

@Component
public class Gender {
    private final long id;
    private final String gender;
    public Gender(long id, String gender) {
        this.id = id;
        this.gender = gender;
    }
    public long getId() {
        return id;
    }
    public String getGender() {
        return gender;
    }
    public String checkGender(String name) {
        if (name.charAt(name.length() - 1) == 'a') {
            return "Kobieta";
        } else {
            return "Mężczyzna";
        }
    }
}
