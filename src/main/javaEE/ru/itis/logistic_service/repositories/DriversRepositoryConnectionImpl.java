package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Carrier;
import ru.itis.logistic_service.models.Driver;
import ru.itis.logistic_service.models.Truck;

import java.util.List;
import java.util.Optional;

public class DriversRepositoryConnectionImpl implements DriversRepository {
    @Override
    public List<Driver> findAllByCarrier(Carrier carrierCompany) {
        return null;
    }

    @Override
    public List<Driver> findAllByName(String name) {
        return null;
    }

    @Override
    public Truck findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Driver model) {

    }

    @Override
    public void update(Driver model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Driver> findAll() {
        return null;
    }
}
