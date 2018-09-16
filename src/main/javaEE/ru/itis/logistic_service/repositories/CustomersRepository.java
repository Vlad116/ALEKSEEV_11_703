package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.Customer;

public interface CustomersRepository extends CrudRepository<Customer>{
    Customer findOneByPhoneNumber(String phoneNumber);

    Customer findOneByCompanyName(String companyName);

}
