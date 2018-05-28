/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vgo.gateway.util.token;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.security.Key;
import java.util.Date;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author tuantran
 */
public class JWTUtil {
    
    private static final JWTUtil INSATNCE = new JWTUtil();
    
    public static JWTUtil getInstance() {
        return INSATNCE;
    }
    
    public String generate(TokenElements tokenElements) {
        String token = null;
        if (tokenElements != null) {
            byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary("");
            Key signingKey = new SecretKeySpec(apiKeySecretBytes, SignatureAlgorithm.HS256.getJcaName());
            
            JwtBuilder builder = Jwts.builder().setId(tokenElements.getUserId())
                        .setIssuedAt(new Date())
                        .setExpiration(new Date(tokenElements.getExpiresTime()))
                        .signWith(SignatureAlgorithm.HS512, signingKey);
            token = builder.compact();
        }
        
        return token;
    }
    
    public TokenElements parse(String token) {
        TokenElements result = null;
        try {
            Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(""))
                    .parseClaimsJws(token).getBody();

            result = new TokenElements();
            result.setUserId( claims.getId() );
            result.setExpiresTime( claims.getExpiration().getTime() );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return result;
    }
}
