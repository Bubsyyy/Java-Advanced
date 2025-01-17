package _09_Iterators_And_Comparators.Comparing_Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!"END".equals(line)) {

            String[] tokens = line.split("\\s+");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            personList.add(person);

            line = scanner.nextLine();
        }

        int n = Integer.parseInt(scanner.nextLine());

        Person person = personList.get(n - 1);
        personList.remove(person);
        int equals = 0;
        for (Person p : personList) {
            int res = p.compareTo(person);

            if (res == 0) {
                equals++;
            }
        }

        if (equals == 0) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", equals + 1, personList.size() - equals, personList.size() + 1);
        }
    }
}
