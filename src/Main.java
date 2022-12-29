import data.User;
import data.comparator.UserComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ирина Шипунова группа 3417/2
 */

public class Main {
    public static void main(String[] args) {
        List<User> userList = Arrays.asList(new User("Paul"),
                new User("Kris"),
                new User("Jack"));
        System.out.println(userList);
        Collections.sort(userList, new UserComparator());
        System.out.println(userList);
    }
}