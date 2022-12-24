package Itana.Prueba.service;

import Itana.Prueba.entity.Mobile_Subscription;
import Itana.Prueba.repository.IMobile_SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Mobile_SubscriptionService {

    private IMobile_SubscriptionRepository iMobile_subscriptionRepository;

    public Mobile_Subscription postMobileSubscription (Mobile_Subscription mobile_subscription){ return iMobile_subscriptionRepository.save(mobile_subscription);}

    public List<Mobile_Subscription> getMobileSubscription () { return (List<Mobile_Subscription>) iMobile_subscriptionRepository.findAll();}
}
