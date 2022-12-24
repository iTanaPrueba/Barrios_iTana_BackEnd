package Itana.Prueba.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "mobileSubscriptions")
public class Mobile_Subscription implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(name = "month")
   private String month;
   @Column(name = "network")
   private String network;
   @Column(name = "plan")
   private String plan;
   @Column(name = "subscriptions")
   private Long subscriptions;
}
