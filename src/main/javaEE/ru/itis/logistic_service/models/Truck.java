package ru.itis.logistic_service.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder

public class Truck {

    private Long id;

    private String mark;
    private String registrationNumber;

    private List<Driver> drivers;
    private Tractor tractor;
    private Trailer trailer;
}