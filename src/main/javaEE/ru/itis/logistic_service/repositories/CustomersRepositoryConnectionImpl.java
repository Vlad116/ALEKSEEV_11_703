package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Customer;
import ru.itis.logistic_service.models.Truck;

import java.util.List;
import java.util.Optional;

public class CustomersRepositoryConnectionImpl implements CustomersRepository {
    @Override
    public Customer findOneByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public Customer findOneByCompanyName(String companyName) {
        return null;
    }

    @Override
    public Truck findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Customer model) {

    }

    @Override
    public void update(Customer model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
