package ru.itis.logistic_service.models;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder

public class Driver {

    private Long id;

    private String name;
    private String surname;
    private String phoneNumber;
    private Short age;

    private Short drivingExperience;
    private Carrier carrierCompany;

}
