package com.codingshuttle.youtube.learningSpringBootApp;

import io.micrometer.observation.annotation.ObservationKeyValue;
import org.springframework.stereotype.Component;

@Component
public class StripePaymentService implements PaymentService {

    @Override
    public String pay() {
        String payment = "Stripe Payment";
        System.out.println("Paying from..."+payment);
        return payment;
    }
}
