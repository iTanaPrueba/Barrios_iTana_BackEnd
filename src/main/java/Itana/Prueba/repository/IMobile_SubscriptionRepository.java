package Itana.Prueba.repository;

import Itana.Prueba.entity.Mobile_Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IMobile_SubscriptionRepository extends CrudRepository<Mobile_Subscription, Long> {

}
