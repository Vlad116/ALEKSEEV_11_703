package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Tractor;
import ru.itis.logistic_service.models.Truck;

import java.util.List;
import java.util.Optional;

public class TractorsRepositoryConnectionImpl implements TractorsRepository {

    @Override
    public Tractor findOneByRegistrationNumber(String registrationNumber) {
        return null;
    }

    @Override
    public List<Tractor> findAllByMark(String mark) {
        return null;
    }

    @Override
    public Truck findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Tractor model) {

    }

    @Override
    public void update(Tractor model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Tractor> findAll() {
        return null;
    }
}
