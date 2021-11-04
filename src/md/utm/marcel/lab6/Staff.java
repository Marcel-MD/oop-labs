package md.utm.marcel.lab6;

import java.time.LocalDate;
import java.util.List;

public class Staff extends Person {
    protected LocalDate joined;
    protected List<String> education,
                           certification,
                           languages;

    public Staff(String title, String givenName, String middleName, String familyName, LocalDate birthDate, Gender gender, Address homeAddress, Phone phone, LocalDate joined, List<String> education, List<String> certification, List<String> languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }

    public LocalDate getJoined() {
        return joined;
    }

    public void setJoined(LocalDate joined) {
        this.joined = joined;
    }

    public List<String> getEducation() {
        return education;
    }

    public void setEducation(List<String> education) {
        this.education = education;
    }

    public List<String> getCertification() {
        return certification;
    }

    public void setCertification(List<String> certification) {
        this.certification = certification;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Staff{" +
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
