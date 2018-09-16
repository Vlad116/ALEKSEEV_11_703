package ru.itis.logistic_service.repositories;

import ru.itis.logistic_service.models.User;

import java.util.List;

public interface UsersRepository extends CrudRepository<User> {

    User findOneByPhoneNumber(String phoneNumber);

    User findOneByEmail(String email);

    List<User> findAllByFirstName(String firstName);

}
