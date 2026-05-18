package com.codingshuttle.youtube.learningSpringBootApp;

import org.springframework.stereotype.Component;

//@Component
public class RazorpayPaymentService implements PaymentService {

    @Override
    public String pay(){
        String payment = "Razorpay Payment";
        System.out.println("Paying from..."+payment);
        return payment;
    }
}
