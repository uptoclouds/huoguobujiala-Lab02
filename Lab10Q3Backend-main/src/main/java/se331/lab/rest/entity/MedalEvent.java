package se331.lab.rest.entity;

import jakarta.persistence.*;

@Entity
public class MedalEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String countryName;
    private String medals;

    // getters and setters
}