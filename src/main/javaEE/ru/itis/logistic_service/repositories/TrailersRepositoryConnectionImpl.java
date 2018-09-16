package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Trailer;
import ru.itis.logistic_service.models.Truck;

import java.util.List;
import java.util.Optional;

public class TrailersRepositoryConnectionImpl implements TrailersRepository {
    @Override
    public Trailer findOneByRegistrationNumber(String registrationNumber) {
        return null;
    }

    @Override
    public List<Trailer> findAllByMark(String mark) {
        return null;
    }

    @Override
    public Truck findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Trailer model) {

    }

    @Override
    public void update(Trailer model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Trailer> findAll() {
        return null;
    }
}
