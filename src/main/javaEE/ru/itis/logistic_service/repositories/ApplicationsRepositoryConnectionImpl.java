package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Application;
import ru.itis.logistic_service.models.Customer;
import ru.itis.logistic_service.models.Truck;

import java.util.List;
import java.util.Optional;

public class ApplicationsRepositoryConnectionImpl implements ApplicationsRepository {
    @Override
    public List<Application> findAllByCustomer(Customer customer) {
        return null;
    }

    @Override
    public Truck findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Application model) {

    }

    @Override
    public void update(Application model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Application> findAll() {
        return null;
    }
}
