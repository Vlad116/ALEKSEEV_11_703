package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Carrier;
import ru.itis.logistic_service.models.Truck;

import java.util.List;
import java.util.Optional;

public class CarriersRepositoryConnectionImpl implements CarriersRepository {
    @Override
    public Carrier findOneByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public Carrier findOneByCompanyName(String companyName) {
        return null;
    }

    @Override
    public List<Carrier> findAllByFirstName(Integer theNumberOfTrucks) {
        return null;
    }

    @Override
    public Truck findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Carrier model) {

    }

    @Override
    public void update(Carrier model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Carrier> findAll() {
        return null;
    }
}
