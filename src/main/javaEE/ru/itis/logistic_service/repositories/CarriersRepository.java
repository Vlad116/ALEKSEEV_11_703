package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Carrier;

import java.util.List;

public interface CarriersRepository extends CrudRepository<Carrier> {

    Carrier findOneByPhoneNumber(String phoneNumber);

    Carrier findOneByCompanyName(String companyName);

    List<Carrier> findAllByFirstName(Integer theNumberOfTrucks);

}
