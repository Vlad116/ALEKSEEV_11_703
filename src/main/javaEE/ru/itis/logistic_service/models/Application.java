package ru.itis.logistic_service.models;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder

public class Application {

    private Long id;

    private LocalDateTime date;
    private String loadingAddress;
    private String unloadingaddress;

    private Integer weight;
    private Integer payment;

    private Customer customer;
    private Carrier carrier;
    private List<Cargo> cargos;

}
