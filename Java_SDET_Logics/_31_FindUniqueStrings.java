import java.util.*;

public class _31_FindUniqueStrings {

    public static void main(String[] args) {

        String[] names = {
            "Java", "Selenium", "Playwright",
            "Java", "Cucumber", "Selenium", "RestAssured","Cucumber","Java"
        };

        Set<String> set = new TreeSet<>();

        for (String name : names) {
            set.add(name);
        }

        System.out.println("Unique strings:");

        for (String name : set) {
            System.out.println(name);
        }
    }
}