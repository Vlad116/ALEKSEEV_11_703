package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Truck;

import java.util.List;

public interface CrudRepository<T> {

    T findOne(Long id);

    void save(T model);

    void update(T model);

    void delete(Long id);

    List<T> findAll();
}