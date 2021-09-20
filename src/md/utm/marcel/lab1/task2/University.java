package md.utm.marcel.lab1.task2;

import java.time.Year;
import java.util.List;

public class University {
    private String name;
    private Integer foundationYear;
    private List<Student> students;

    public University(String name, Integer foundationYear, List<Student> students) {
        this.name = name;
        this.students = students;
        if (foundationYear > Year.now().getValue()) {
            System.out.println("Invalid university foundation year");
        } else {
            this.foundationYear = foundationYear;
        }
    }

    public Double getAverageMark() {
        if (students.isEmpty()) {
            return 0.0;
        }

        Double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i).getMark();
        }

        return sum / students.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(Integer foundationYear) {
        if (foundationYear > Year.now().getValue()) {
            System.out.println("Invalid university foundation year");
            return;
        }
        this.foundationYear = foundationYear;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        University that = (University) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (foundationYear != null ? !foundationYear.equals(that.foundationYear) : that.foundationYear != null)
            return false;
        return students != null ? students.equals(that.students) : that.students == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (foundationYear != null ? foundationYear.hashCode() : 0);
        result = 31 * result + (students != null ? students.hashCode() : 0);
        return result;
    }
}
