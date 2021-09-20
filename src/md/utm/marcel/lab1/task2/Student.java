package md.utm.marcel.lab1.task2;

public class Student {
    private String name;
    private Integer age;
    private Double mark;

    public Student(String name, Integer age, Double mark) {
        this.name = name;

        if (age > 99 || age < 7) {
            System.out.println("Invalid student age!");
        } else {
            this.age = age;
        }

        if (mark > 10.0 || mark < 0.0) {
            System.out.println("Invalid student mark!");
        } else {
            this.mark = mark;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 99 || age < 7) {
            System.out.println("Invalid student age!");
            return;
        }
        this.age = age;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        if (mark > 10.0 || mark < 0.0) {
            System.out.println("Invalid student mark!");
            return;
        }
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (age != null ? !age.equals(student.age) : student.age != null) return false;
        return mark != null ? mark.equals(student.mark) : student.mark == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (mark != null ? mark.hashCode() : 0);
        return result;
    }
}
