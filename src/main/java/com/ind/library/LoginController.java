package com.ind.library;

import com.ind.library.entity.Users;
import com.ind.library.service.KisiService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/login")
public class LoginController {
    private final KisiService kisiService;

    public LoginController(KisiService kisiService) {
        this.kisiService = kisiService;
    }

    @CrossOrigin
    @GetMapping("/check")
    public boolean checkUser(@RequestParam BigDecimal id, @RequestParam String sifre) {
        return kisiService.userCheck(id, sifre);
    }



}
