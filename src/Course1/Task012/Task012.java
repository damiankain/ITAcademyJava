package Course1.Task012;
/* 12. Напишите программу, в которой используются две переменные логического
типа (boolean), присвойте им значения и выведете для каждой переменной на экран
 строку "истина", если переменная имеет значение true и "ложь", если переменная
  имеет значение false.*/
public class Task012 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (a) {
            System.out.println("Истина");
        } else if (!a){
            System.out.println("Ложь");
        }
    }
}
