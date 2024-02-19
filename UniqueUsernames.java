package Lesson_27.Task4;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueUsernames {

   static Set<String> usernames = new LinkedHashSet<>();
    public static void main(String[] args) {

        UniqueUsernames.addUsername("tural");
        UniqueUsernames.addUsername("elvin");
        UniqueUsernames.addUsername("matlab");

        UniqueUsernames.displayUsername();



    }

    public static void addUsername(String name){
        usernames.add(name);
    }
    public static void removeUsername(String name){
        usernames.remove(name);
    }
    public static boolean containsUsername(String name){
        return usernames.contains(name);
    }
    public static void displayUsername(){
        usernames.stream()
                .forEach(a-> System.out.println(a));
    }

}
