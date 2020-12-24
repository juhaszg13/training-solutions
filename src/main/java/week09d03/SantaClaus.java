package week09d03;

import java.util.List;

public class SantaClaus {
    private List<Person> persons;

    public SantaClaus(List<Person> persons) {
        this.persons = persons;
    }

    public void getThroughChimneys() {
        for (int i = 0; i < persons.size(); i++) {
            persons.get(i).setPresent();
        }
    }

    public List<Person> getPersons() {
        return persons;
    }
}
