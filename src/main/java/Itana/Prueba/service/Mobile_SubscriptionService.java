package Itana.Prueba.service;

import Itana.Prueba.entity.Mobile_Subscription;
import Itana.Prueba.repository.IMobile_SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Mobile_SubscriptionService {

    @Autowired
    private IMobile_SubscriptionRepository iMobile_subscriptionRepository;

    public Mobile_Subscription postMobileSubscription (Mobile_Subscription mobile_subscription){ return iMobile_subscriptionRepository.save(mobile_subscription);}

    public List<Mobile_Subscription> getAllMobileSubscription () { return (List<Mobile_Subscription>) iMobile_subscriptionRepository.findAll();}

    public Optional<Mobile_Subscription> getByIdMobileSubscription (Long id) { return iMobile_subscriptionRepository.findById(id);}

    public Mobile_Subscription updateMobileSubscription (Mobile_Subscription newData, Long id){
        var mobileSubscriptionUpdate = iMobile_subscriptionRepository.findById(id).get();
        mobileSubscriptionUpdate.setMonth(newData.getMonth());
        mobileSubscriptionUpdate.setNetwork(newData.getNetwork());
        mobileSubscriptionUpdate.setPlan(newData.getPlan());
        mobileSubscriptionUpdate.setSubscriptions(newData.getSubscriptions());
        return iMobile_subscriptionRepository.save(mobileSubscriptionUpdate);
    }

    public void deleteMobileSubscription(Long id){
        iMobile_subscriptionRepository.deleteById(id);
    }
}
