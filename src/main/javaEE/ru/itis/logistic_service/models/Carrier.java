package ru.itis.logistic_service.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder

public class Carrier {

    private Long id;

    private String companyName;
    private String directorName;
    private String phoneNumber;
    private String adress;

    private Integer theNumberOfTrucks;
//    private List<Truck> trucks;
    private List<Driver> drivers;
    private List<Application> applications;

}
