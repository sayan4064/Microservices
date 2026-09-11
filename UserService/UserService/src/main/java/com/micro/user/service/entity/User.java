package com.micro.user.service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class User {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.UUID)
    private  UUID userId;

    @Column(name="NAME",length=20)
    private String userName;

    @Column(name="EMAIL")
    private String email;

    @Column(name="ABOUT")
    private String about;
    @Transient
    private List<Rating> rating =new ArrayList<>();
}
