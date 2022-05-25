package com.cognizant.capybarasfems.ModelTests;

import com.cognizant.capybarasfems.Models.AuthRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthReqTest {

    AuthRequest authRequest;

    @BeforeEach
    public void setup(){
        authRequest = new AuthRequest("wcp123", "password", "clientid", "access");
    }

    @Test
    public void AuthReqConstructorTest(){
        Assertions.assertEquals("wcp123", authRequest.getUsername());
        Assertions.assertEquals("password", authRequest.getPassword());
        Assertions.assertEquals("clientid", authRequest.getClient_id());
        Assertions.assertEquals("access", authRequest.getGrant_type());
    }

    @Test
    public void AuthReqGettersAndSettersTest(){
        authRequest.setUsername("joanthony123");
        authRequest.setPassword("password2");
        authRequest.setClient_id("clientid2");
        authRequest.setGrant_type("accessGranted");
        Assertions.assertEquals("joanthony123", authRequest.getUsername());
        Assertions.assertEquals("password2", authRequest.getPassword());
        Assertions.assertEquals("clientid2", authRequest.getClient_id());
        Assertions.assertEquals("accessGranted", authRequest.getGrant_type());

    }
}
