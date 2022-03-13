package Course1.Task013;
/* 13. Напишите программу, где двум строковым переменным присваиваются
значения, третей же строковой переменных присвойте объединение (конкатенацию)
 двух предыдущих строк. Затем напечатайте значение третьей строковой переменной.*/
public class Task013 {
    public static void main(String[] args) {
        String one = "Hello";
        String two = "Java!";
        String three = one + " " + two;
        System.out.println(three);
    }
}
