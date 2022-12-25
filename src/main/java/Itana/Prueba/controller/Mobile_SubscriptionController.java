package Itana.Prueba.controller;

import Itana.Prueba.entity.Mobile_Subscription;
import Itana.Prueba.service.Mobile_SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mobileSubscription")
public class Mobile_SubscriptionController {
    @Autowired
    private Mobile_SubscriptionService mobile_subscriptionService;

    @PostMapping
    public ResponseEntity<Mobile_Subscription> post(@RequestBody Mobile_Subscription mobile_subscription){
        return ResponseEntity.status(HttpStatus.CREATED).body(mobile_subscriptionService.postMobileSubscription(mobile_subscription));
    }

    @GetMapping()
    public ResponseEntity<List<Mobile_Subscription>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(mobile_subscriptionService.getAllMobileSubscription());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id){
        mobile_subscriptionService.deleteMobileSubscription(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity update(Mobile_Subscription mobile_subscription, @PathVariable("id") Long id){
        mobile_subscriptionService.updateMobileSubscription(mobile_subscription, id);
        return ResponseEntity.status(HttpStatus.OK).body(mobile_subscriptionService.getByIdMobileSubscription(id));
    }
}
