package Itana.Prueba.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "FTPMOSUB")
@JsonIgnoreProperties(value = {"id"}, allowGetters = true)
public class Mobile_Subscription implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(name = "MSMON")
   private String month;
   @Column(name = "MSNET")
   private String network;
   @Column(name = "MSPLA")
   private String plan;
   @Column(name = "MSSUB")
   private Long subscriptions;
}
