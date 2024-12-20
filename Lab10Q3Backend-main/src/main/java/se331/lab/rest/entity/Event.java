package se331.lab.rest.entity;

import jakarta.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "`ranks`")
    private String rank;
    private String rankChangeType;
    private String countryName;
    private String goldMedalNum;
    private String silverMedalNum;
    private String bronzeMedalNum;
    private String totalMedalNum;

    // getters and setters
}
