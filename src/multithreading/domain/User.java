package multithreading.domain;

import java.util.Objects;

public class User {

    private static int userID;

    public User(int userID) {
        System.out.println("User " + userID + " calling in Callcentre");
        User.userID = userID;
    }

    public static int getUserID() {
        return userID;
    }

    public static void setUserID(int userID) {
        User.userID = userID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userID == userID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID);
    }

    @Override
    public String toString() {
        return "User{" +
                "user " + userID +
                '}';
    }

}