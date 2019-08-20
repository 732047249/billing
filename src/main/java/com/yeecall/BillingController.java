package com.yeecall;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class BillingController {

    @RequestMapping("/data/balance")
    public float balance() {
        return 500000;
    }
    @RequestMapping("/data/deposit/{amount}")
    public float deposit( @PathVariable float amount) {
        return 500000 + amount;
    }

}
