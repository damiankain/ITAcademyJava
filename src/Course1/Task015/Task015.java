package Course1.Task015;
/*
15. Выведете на экран все числа от 1 до 100 с помощью цикла
(можно все три варианта в одной программе):
for
while
do while
*/
public class Task015 {
    public static void main(String[] args) {

        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }

        int i =0;
        while (i < 101) {
            System.out.println(i);
            i++;
        }

        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 101);

    }

}
