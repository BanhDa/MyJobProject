/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vgo.gateway.request;

import lombok.Data;

/**
 *
 * @author tuantran
 */
@Data
public class LoginRequest {
    
    private String userName;
    private String password;
}
