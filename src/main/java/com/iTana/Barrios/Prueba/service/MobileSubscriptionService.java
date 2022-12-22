package com.iTana.Barrios.Prueba.service;

import com.iTana.Barrios.Prueba.entities.Mobile_Subscription;
import com.iTana.Barrios.Prueba.repository.IMobile_SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileSubscriptionService {

    @Autowired
    private IMobile_SubscriptionRepository iMobileSubscriptionRepository;

    public Mobile_Subscription postMobileSubscription (Mobile_Subscription mobile_subscription) { return iMobileSubscriptionRepository.save(mobile_subscription);}
    public List<Mobile_Subscription> getMobileSubscription () { return iMobileSubscriptionRepository.findAll();}
}
