/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vgo.gateway.cache;

import com.mycompany.vgo.gateway.util.HashCodeUtil;
import com.zaxxer.sparsebits.SparseBitSet;

/**
 *
 * @author tuantran
 */
public class SessionManagement {
    
    private final SparseBitSet container = new SparseBitSet();
    
    private static final SessionManagement INSTANCE = new SessionManagement();
    
    public static SessionManagement getInstance() {
        return INSTANCE;
    }
    
    public void push(String userId, String token) {
        int hashCode = HashCodeUtil.hashCode(userId, token);
        if (hashCode != 0) {
            container.set(hashCode, true);
        }
    }
    
    public void remove(String userId, String token) {
        int hashCode = HashCodeUtil.hashCode(userId, token);
        if (hashCode != 0) {
            container.(hashCode, true);
        }
    }
}
