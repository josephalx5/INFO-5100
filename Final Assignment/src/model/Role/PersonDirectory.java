package model.Role;

import java.util.ArrayList;

public class PersonDirectory {
    ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    public void addPerson(Person person) {
        personList.add(person);
    }
    public void removePerson(String username) {
        for (Person person : personList) {
            if (person.getUsername().equals(username)) {
                personList.remove(person);
                break;
            }
        }
    }
    public Person getPerson(String username) {
        for (Person person : personList) {
            if (person.getUsername().equals(username)) {
                return person;
            }
        }
        return null;
    }

}
