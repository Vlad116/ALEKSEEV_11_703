package ru.itis.logistic_service.models;

import java.util.List;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder

public class Customer {
    private Long id;

    private String companyName;
    private String directorName;
    private String phoneNumber;
    private String adress;

    private List<Application> applications;
}