package hw_book_good_student.domain;

public class Student {
 private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
        this.id = id++;
    }

    public Student(int id) {
        this.id = id++;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
