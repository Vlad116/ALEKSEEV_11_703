package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Tractor;

import java.util.List;

public interface TractorsRepository extends CrudRepository<Tractor> {

    Tractor findOneByRegistrationNumber (String registrationNumber);

    List<Tractor> findAllByMark (String mark);

}
