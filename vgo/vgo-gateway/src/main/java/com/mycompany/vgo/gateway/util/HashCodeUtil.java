/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vgo.gateway.util;

/**
 *
 * @author tuantran
 */
public class HashCodeUtil {
    
    public static int hashCode(String id1, String id2){
        if (id1.length() == 0 || id2.length() == 0) return 0;
        String value = id1 + "_" + id2;
        return (value.hashCode() & 0x7fffffff);
    }

    public static int hashCode(String id){
        return (id.hashCode() & 0x7fffffff);
    }
    
}
