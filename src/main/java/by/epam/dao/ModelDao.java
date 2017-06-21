package by.epam.dao;

import by.epam.bean.Model;
import by.epam.bean.User;
import by.epam.exeption.PersistException;

import java.util.List;

public interface ModelDao<T extends Model> {

    public T add(T model) throws PersistException;

    public T getById(int id) throws PersistException;

    public void update(T model) throws PersistException;

    public void delete(T model) throws PersistException;

    public List<T> getAll() throws PersistException;
}
