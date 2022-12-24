package Itana.Prueba.controller;

import Itana.Prueba.entity.Mobile_Subscription;
import Itana.Prueba.service.Mobile_SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mobileSubscription/")
public class Mobile_SubscriptionController {
    @Autowired
    private Mobile_SubscriptionService mobile_subscriptionService;

    @PostMapping
    public ResponseEntity<Mobile_Subscription> postMobileSubscription(@RequestBody Mobile_Subscription mobile_subscription){
        return ResponseEntity.status(HttpStatus.CREATED).body(mobile_subscriptionService.postMobileSubscription(mobile_subscription));
    }
}
