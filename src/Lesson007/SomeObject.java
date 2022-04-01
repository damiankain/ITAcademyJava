package Lesson007;

public class SomeObject {
    private static String someString;


    public SomeObject(String someString) {
        this.someString = someString;
    }

    public static String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    @Override
    public String toString() {
        return "SomeObject{" +
                "someString='" + someString + '\'' +
                '}';
    }
}
