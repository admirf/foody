package com.ius.foodyapi.model;

import javax.persistence.*;

@Entity
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private boolean verified = false; // business is to be verified
    @ManyToOne(targetEntity = Provider.class)
    private Provider provider;
}
