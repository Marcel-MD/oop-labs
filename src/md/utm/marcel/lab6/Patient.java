package md.utm.marcel.lab6;

import java.time.LocalDate;
import java.util.List;

public class Patient extends Person {
    protected String id;
    protected LocalDate accepted;
    protected History sickness;
    protected Integer age;
    protected List<String> prescriptions,
                           allergies,
                           specialReqs;

    public Patient(String title, String givenName, String middleName, String familyName, LocalDate birthDate, Gender gender, Address homeAddress, Phone phone, String id, LocalDate accepted, History sickness, Integer age, List<String> prescriptions, List<String> allergies, List<String> specialReqs) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone);
        this.id = id;
        this.accepted = accepted;
        this.sickness = sickness;
        this.age = age;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getAccepted() {
        return accepted;
    }

    public void setAccepted(LocalDate accepted) {
        this.accepted = accepted;
    }

    public History getSickness() {
        return sickness;
    }

    public void setSickness(History sickness) {
        this.sickness = sickness;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<String> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public List<String> getSpecialReqs() {
        return specialReqs;
    }

    public void setSpecialReqs(List<String> specialReqs) {
        this.specialReqs = specialReqs;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", accepted=" + accepted +
                ", sickness=" + sickness +
                ", age=" + age +
                ", prescriptions=" + prescriptions +
                ", allergies=" + allergies +
                ", specialReqs=" + specialReqs +
                ", title='" + title + '\'' +
                ", givenName='" + givenName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", homeAddress=" + homeAddress +
                ", phone=" + phone +
                '}';
    }
}
