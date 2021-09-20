package md.utm.marcel.lab1.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("\n//============ TASK 2 & 3 ============//\n");

        List<Student> utmStudents = new ArrayList<Student>();
        utmStudents.add(new Student("Marcel", 19, 10.0));
        utmStudents.add(new Student("Maria", 21, 9.6));
        utmStudents.add(new Student("Ion", 22, 5.7));
        University utm = new University("UTM", 1964, utmStudents);

        List<Student> asemStudents = new ArrayList<Student>();
        asemStudents.add(new Student("Victor", 18, 7.0));
        asemStudents.add(new Student("Mihai", 21, 8.6));
        asemStudents.add(new Student("Ana", 20, 6.9));
        University asem = new University("ASEM", 1991, asemStudents);

        List<Student> usmStudents = new ArrayList<Student>();
        usmStudents.add(new Student("Ion", 23, 5.0));
        usmStudents.add(new Student("Vasile", 20, 7.7));
        usmStudents.add(new Student("Andreea", 21, 8.7));
        University usm = new University("USM", 1946, usmStudents);

        System.out.println("ASEM average: " + asem.getAverageMark());
        System.out.println("UTM average: " + utm.getAverageMark());
        System.out.println("USM average: " + usm.getAverageMark());

        List<University> universities = new ArrayList<University>();
        universities.add(utm);
        universities.add(asem);
        universities.add(usm);

        Double sum = 0.0;
        for (int i = 0; i < universities.size(); i++) {
            sum += universities.get(i).getAverageMark();
        }
        Double average = sum / universities.size();

        System.out.println("Universities average: " + average);
    }
}
