package de.lubowiecki.playground;

import java.util.List;

public interface GenericCrud<T> {

    public T findById(int id);

    public List<T> find();

    public boolean insert(T obj);

    public boolean update(T obj);

    public boolean delete(T obj);

    public boolean deleteById(int id);
}
