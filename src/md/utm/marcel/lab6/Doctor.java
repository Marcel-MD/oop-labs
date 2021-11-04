package md.utm.marcel.lab6;

import java.time.LocalDate;
import java.util.List;

public class Doctor extends OperationsStaff {
    protected List<String> specialty,
                           locations;

    public Doctor(String title, String givenName, String middleName, String familyName, LocalDate birthDate, Gender gender, Address homeAddress, Phone phone, LocalDate joined, List<String> education, List<String> certification, List<String> languages, List<String> specialty, List<String> locations) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone, joined, education, certification, languages);
        this.specialty = specialty;
        this.locations = locations;
    }

    public List<String> getSpecialty() {
        return specialty;
    }

    public void setSpecialty(List<String> specialty) {
        this.specialty = specialty;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialty=" + specialty +
                ", locations=" + locations +
                ", title='" + title + '\'' +
                ", givenName='" + givenName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", homeAddress=" + homeAddress +
                ", phone=" + phone +
                ", joined=" + joined +
                ", education=" + education +
                ", certification=" + certification +
                ", languages=" + languages +
                '}';
    }
}

