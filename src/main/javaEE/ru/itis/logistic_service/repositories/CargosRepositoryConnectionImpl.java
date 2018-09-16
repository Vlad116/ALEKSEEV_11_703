package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Cargo;
import ru.itis.logistic_service.models.Truck;

import java.util.List;
import java.util.Optional;

public class CargosRepositoryConnectionImpl implements CargosRepository {
    @Override
    public List<Cargo> findAllByType(String type) {
        return null;
    }

    @Override
    public Truck findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Cargo model) {

    }

    @Override
    public void update(Cargo model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Cargo> findAll() {
        return null;
    }
}
