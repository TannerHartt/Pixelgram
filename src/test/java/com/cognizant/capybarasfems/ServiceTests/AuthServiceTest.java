package com.cognizant.capybarasfems.ServiceTests;

import com.cognizant.capybarasfems.Models.AuthRequest;
import com.cognizant.capybarasfems.Models.AuthResponse;
import com.cognizant.capybarasfems.Services.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthServiceTest {
    AuthService service;

    MockAuthClient mockClient;

    @BeforeEach
    public void setup() {
        mockClient = new MockAuthClient();
        service = new AuthService(mockClient);
    }

    @Test
    public void sendRequest() {
        AuthRequest req = new AuthRequest(
                "user1",
                "pass1",
                "client1",
                "grant1"
        );

        AuthResponse resp = service.requestAuth(req);
        Assertions.assertEquals("token", resp.getAccess_token());
    }

    @Test
    public void sendRequestWithUserAndPass() {
        AuthResponse resp = service.requestAuth("user1", "pass1");
        Assertions.assertEquals("token", resp.getAccess_token());
    }
}
