package com.cognizant.capybarasfems.ModelTests;

import com.cognizant.capybarasfems.Models.AuthRequest;
import com.cognizant.capybarasfems.Models.AuthResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthResponseTest {

    AuthResponse authResponse;

    @BeforeEach
    public void setup() {
        authResponse = new AuthResponse(
                "joanthony1",
                2,
                1,
                "joanthony2",
                "gold",
                134556789,
                "open",
                "scope");
    }

    @Test
    public void testAuthResponseConstructors() {
        Assertions.assertEquals("joanthony1", authResponse.getAccess_token());
        Assertions.assertEquals(2, authResponse.getExpires_in());
        Assertions.assertEquals(1, authResponse.getRefresh_expires_in());
        Assertions.assertEquals("joanthony2", authResponse.getRefresh_token());
        Assertions.assertEquals("gold", authResponse.getToken_type());
        Assertions.assertEquals(134556789, authResponse.getNot_before_policy());
        Assertions.assertEquals("open", authResponse.getSession_state());
        Assertions.assertEquals("scope",authResponse.getScope());
    }

    @Test
    public void testAuthResponseGettersAndSetters() {
        authResponse.setAccess_token("joanthony1");
        authResponse.setExpires_in(2);
        authResponse.setRefresh_expires_in(1);
        authResponse.setRefresh_token("joanthony2");
        authResponse.setToken_type("gold");
        authResponse.setNot_before_policy(134556789);
        authResponse.setSession_state("open");
        authResponse.setScope("scope");
        Assertions.assertEquals("joanthony1",authResponse.getAccess_token());
        Assertions.assertEquals(2,authResponse.getExpires_in());
        Assertions.assertEquals(1,authResponse.getRefresh_expires_in());
        Assertions.assertEquals("joanthony2", authResponse.getRefresh_token());
        Assertions.assertEquals("gold",authResponse.getToken_type());
        Assertions.assertEquals(134556789,authResponse.getNot_before_policy());
        Assertions.assertEquals("open", authResponse.getSession_state());
        Assertions.assertEquals("scope", authResponse.getScope());


    }
}
