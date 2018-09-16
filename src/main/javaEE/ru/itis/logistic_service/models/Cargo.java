package ru.itis.logistic_service.models;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Cargo {

    private Long id;

    private Integer weight;
    private String type;

    private Application application;

}
