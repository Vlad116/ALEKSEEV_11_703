package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Carrier;
import ru.itis.logistic_service.models.Driver;

import java.util.List;

public interface DriversRepository extends CrudRepository<Driver> {

    List<Driver> findAllByCarrier(Carrier carrierCompany);

    List<Driver> findAllByName(String name);
}
