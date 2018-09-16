package ru.itis.logistic_service.app;

import ru.itis.logistic_service.models.User;

public class BuilderDemo {
    public static void main(String[] args) {

        User user = User.builder()
                .email("asda@mail.ru")
                .firstName("Ahmed")
                .lastName("Ahmedov")
                .phoneNumber("+7989293244")
                .build();

        System.out.println(user.toString());




    }
}
