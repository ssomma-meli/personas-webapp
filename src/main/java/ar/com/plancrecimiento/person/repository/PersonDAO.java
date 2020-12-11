package ar.com.plancrecimiento.person.repository;

import ar.com.plancrecimiento.person.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;

public class PersonDAO {

    private static List<Person> listPersons;


    public PersonDAO() {
        this.listPersons = new ArrayList<Person>();
    }

    public static void addPerson(Person person){
        listPersons.add(person);
    }

    public void setListPersons(List<Person> listPersons) {
        this.listPersons = listPersons;
    }

    public List<Person> getListPersons() {
        return listPersons;
    }

    public Optional<Person> getPersonById(Long id) {
        return listPersons.stream()
                .filter(person -> person.getId() == id).findFirst();
    }
}
