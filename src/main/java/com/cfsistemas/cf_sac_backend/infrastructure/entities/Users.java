package com.cfsistemas.cf_sac_backend.infrastructure.entities;

import jakarta.persistence.*;

public class Users {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String email;
}
