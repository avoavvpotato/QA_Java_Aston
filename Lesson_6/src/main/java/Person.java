public class Person {
    private final String fullName;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final double salary;
    private final int age;

    public Person(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Full Name: " + fullName +
                ", Position: " + position +
                ", Email: " + email +
                ", Number: " + phoneNumber +
                ", Salary: " + salary +
                ", Age: " + age);
    }
}
