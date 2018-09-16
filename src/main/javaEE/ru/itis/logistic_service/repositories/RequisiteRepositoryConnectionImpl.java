package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Requisite;
import ru.itis.logistic_service.models.Truck;

import java.util.List;
import java.util.Optional;

public class RequisiteRepositoryConnectionImpl implements RequisiteRepository {
    @Override
    public Requisite findOneByFullCompanyName(String fullCompanyName) {
        return null;
    }

    @Override
    public Truck findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Requisite model) {

    }

    @Override
    public void update(Requisite model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Requisite> findAll() {
        return null;
    }
}
