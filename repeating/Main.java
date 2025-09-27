package repeating;
// testing learning java
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        HashMap<Person, String> contacts = new HashMap<>();

        String firstName = "Steve";
        String lastName = "Jobs";
        String phoneNumber = "1 (123) 456-78-90";

        persons.add(new Person(firstName, lastName));
        contacts.put(new Person(firstName, lastName), phoneNumber);

        System.out.println("Amount people in the list: " + persons.size() +
                ", contacts: " + contacts.size());

        if(persons.contains(new Person(firstName, lastName))) {}

    }


}

class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



}