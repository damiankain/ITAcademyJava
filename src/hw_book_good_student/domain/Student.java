package hw_book_good_student.domain;

import java.util.Objects;

public class Student implements Comparable <Student>{
    private static int counter;
    private int id;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Student.counter = counter;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
        counter++;
        this.id = counter;
    }

    public Student(int counter, int id) {
        this.counter = counter;
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}'+ "\n";
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
