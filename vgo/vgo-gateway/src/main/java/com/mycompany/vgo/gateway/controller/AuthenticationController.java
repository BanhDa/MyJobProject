/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vgo.gateway.controller;

import com.mycompany.vgo.gateway.config.SecurityConstants;
import com.mycompany.vgo.gateway.request.LoginRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tuantran
 */
@RestController
public class AuthenticationController {
    
    @PostMapping(SecurityConstants.SIGN_UP_URL)
    public void login(@RequestBody LoginRequest request) {
        System.out.println(" login controler: ");
        System.out.println("request: " + request);
    }
}
