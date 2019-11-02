package com.manning.mss.ch13.sample03.service;

import com.manning.mss.ch13.sample03.paymententity.PaymentDetail;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsService {

    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    public String pay(@RequestBody PaymentDetail paymentDetail) {
        return "Payment Successful";
    }


}
