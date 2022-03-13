package Course1.Task009;
/*9 Объявить 2 переменных целого типа. Необходимо поменять значения переменных так,
чтобы значение первой оказалось во второй, а второй - в первой.*/
public class Task9 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a=a+b-(b=a);

        System.out.println(a);
        System.out.println(b);
    }
}
