package com.iTana.Barrios.Prueba.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Mobile_Subscriptions")
public class Mobile_Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String month;
    private String network;
    private String plan;
    private Long subscriptions;
}
