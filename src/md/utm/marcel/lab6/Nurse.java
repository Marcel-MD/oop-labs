package md.utm.marcel.lab6;

import java.time.LocalDate;
import java.util.List;

public class Nurse extends OperationsStaff {
    public Nurse(String title, String givenName, String middleName, String familyName, LocalDate birthDate, Gender gender, Address homeAddress, Phone phone, LocalDate joined, List<String> education, List<String> certification, List<String> languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone, joined, education, certification, languages);
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "title='" + title + '\'' +
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
