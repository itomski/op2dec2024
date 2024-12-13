package de.lubowiecki.playground;

import de.lubowiecki.playground.json.Fahrzeug;

import java.util.List;

public class PersonCrud implements GenericCrud<Person> {
    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public List<Person> find() {
        return List.of();
    }

    @Override
    public boolean insert(Person obj) {
        return false;
    }

    @Override
    public boolean update(Person obj) {
        return false;
    }

    @Override
    public boolean delete(Person obj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
