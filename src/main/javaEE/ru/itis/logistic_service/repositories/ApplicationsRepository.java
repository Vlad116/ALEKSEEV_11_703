package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Application;
import ru.itis.logistic_service.models.Customer;

import java.util.List;

public interface ApplicationsRepository extends CrudRepository<Application> {
    List<Application> findAllByCustomer(Customer customer);
}
