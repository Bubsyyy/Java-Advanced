package _03_Inheritance.animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setAge(age);
        setName(name);
        setGender(gender);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    private void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || !Character.isLetter(name.charAt(0))) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    private void setGender(String gender) {
        if (gender.equals("Male") || gender.equals("Female")) {
            this.gender = gender;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public String produceSound(){
        return "";
    }

    @Override
    public String toString() {
        return String.format("%s\n" +
                        "%s %d %s\n" +
                        "%s",
                this.getClass().getSimpleName(),
                this.name,
                this.age,
                this.gender,
                produceSound());
    }
}