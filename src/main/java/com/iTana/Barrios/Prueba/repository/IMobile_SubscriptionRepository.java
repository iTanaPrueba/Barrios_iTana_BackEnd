package com.iTana.Barrios.Prueba.repository;

import com.iTana.Barrios.Prueba.entities.Mobile_Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMobile_SubscriptionRepository extends JpaRepository<Mobile_Subscription, Long> {
}
