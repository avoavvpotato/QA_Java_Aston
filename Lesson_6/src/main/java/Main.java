public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 50000, 30);
        persArray[1] = new Person("Petrov Petr", "Designer", "petrov@mailbox.com", "892345678", 45000, 28);
        persArray[2] = new Person("Sidorov Sidor", "Manager", "sidorov@mailbox.com", "892398765", 60000, 35);
        persArray[3] = new Person("Kuznetsov Kuzya", "Analyst", "kuznetsov@mailbox.com", "892456789", 55000, 32);
        persArray[4] = new Person("Smirnov Semyon", "Developer", "smirnov@mailbox.com", "892478965", 70000, 29);

        System.out.println("\nTask_2");
        for (Person person : persArray) {
            person.printInfo();
        }

        Park park = new Park();
        System.out.println("\nTask_3");
        park.addAttraction("Roller Coaster", "10:00 - 18:00", 350);
        park.addAttraction("Ferris Wheel", "11:00 - 17:00", 600);
        park.addAttraction("Haunted House", "11:00 - 20:00", 200);

        park.printAttraction();
    }
}
