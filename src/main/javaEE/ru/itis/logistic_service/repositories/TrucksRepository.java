package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Truck;

import java.util.List;

public interface TrucksRepository extends CrudRepository<Truck> {

    Truck findOneByRegistrationNumber(String registrationNumber);

    List<Truck> findAllByMark(String mark);

}
