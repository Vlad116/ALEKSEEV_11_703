package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Requisite;

public interface RequisiteRepository extends CrudRepository<Requisite> {

    Requisite findOneByFullCompanyName(String fullCompanyName);

}
