package Lesson003;

public class Lesson003 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(5, "Барсик", 4.5);

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());

        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println(cat1.equals(cat2));

    }
}
