package _03_Inheritance.animals;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while (!"Beast!".equals(line)) {

            try {
                switch (line) {
                    case "Cat":
                        String[] tokens = scanner.nextLine().split("\\s+");
                        Cat cat = new Cat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(cat);
                        break;
                    case "Dog":
                        tokens = scanner.nextLine().split("\\s+");
                        Dog dog = new Dog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(dog);
                        break;
                    case "Frog":
                        tokens = scanner.nextLine().split("\\s+");
                        Frog frog = new Frog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(frog);
                        break;
                    case "Kitten":
                        tokens = scanner.nextLine().split("\\s+");
                        Kitten kitten = new Kitten(tokens[0], Integer.parseInt(tokens[1]));
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        tokens = scanner.nextLine().split("\\s+");
                        Tomcat tomcat = new Tomcat(tokens[0], Integer.parseInt(tokens[1]));
                        System.out.println(tomcat);
                        break;
                }

            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            line = scanner.nextLine();
        }
    }
}