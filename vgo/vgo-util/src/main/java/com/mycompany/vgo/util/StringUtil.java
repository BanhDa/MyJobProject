/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vgo.util;

/**
 *
 * @author tuantran
 */
public class StringUtil {
    
    public boolean validString(String arg) {
        return arg != null && !arg.trim().isEmpty();
    }
    
    public boolean validStrings(String... args) {
        for (String arg : args) {
            if (!validString(arg)) {
                return false;
            }
        }
        return true;
    }
}
