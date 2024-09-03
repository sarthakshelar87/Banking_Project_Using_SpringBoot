package com.sarthak.bankingapp_sarthak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    @GetMapping("/message")
    public String getMessage() {
        return "Everything is running in POSTMAN API please have a look";
    }
}
