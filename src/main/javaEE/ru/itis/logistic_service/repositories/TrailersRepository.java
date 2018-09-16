package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Trailer;

import java.util.List;

public interface TrailersRepository extends CrudRepository<Trailer> {

    Trailer findOneByRegistrationNumber (String registrationNumber);
    List<Trailer> findAllByMark (String mark);

}
