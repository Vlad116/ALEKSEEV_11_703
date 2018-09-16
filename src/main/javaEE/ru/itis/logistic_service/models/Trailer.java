package ru.itis.logistic_service.models;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder

public class Trailer {

    private Long id;
    private String mark;
    private String registrationNumber;

    private Integer yearsOfExploitation;
    private Integer mileage;

    private Truck truck;
}
