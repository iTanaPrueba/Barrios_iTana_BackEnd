package com.iTana.Barrios.Prueba.controller;

import com.iTana.Barrios.Prueba.entities.Mobile_Subscription;
import com.iTana.Barrios.Prueba.service.MobileSubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mobileSubscription/")
public class MobileSubscriptionController {
    @Autowired
    private MobileSubscriptionService mobileSubscriptionService;

    @PostMapping
    public ResponseEntity<Mobile_Subscription> postMobileSubscription(@RequestBody Mobile_Subscription mobile_subscription){
        return ResponseEntity.status(HttpStatus.CREATED).body(mobileSubscriptionService.postMobileSubscription(mobile_subscription));
    }


}
