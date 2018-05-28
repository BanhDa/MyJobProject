/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vgo.gateway.util.token;

import lombok.Data;

/**
 *
 * @author tuantran
 */
@Data
public class TokenElements {
    
    private String userId;
    private long expiresTime;
}
