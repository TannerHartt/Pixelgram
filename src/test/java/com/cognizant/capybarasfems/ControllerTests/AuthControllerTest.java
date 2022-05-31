package com.cognizant.capybarasfems.ControllerTests;

import com.cognizant.capybarasfems.Controller.AuthController;
import com.cognizant.capybarasfems.Models.AuthRequest;
import com.cognizant.capybarasfems.Models.AuthResponse;
import com.cognizant.capybarasfems.ServiceTests.MockAuthClient;
import com.cognizant.capybarasfems.Services.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthControllerTest {

    private AuthController authController;

    @BeforeEach
    public void setUp() {
        MockAuthClient mockAuthClient = new MockAuthClient();
        AuthService authService = new AuthService(mockAuthClient);
        authController = new AuthController(authService);
    }

    @Test
    public void getAuthResponseTest() {
        AuthRequest authRequest = new AuthRequest();
        AuthResponse authResponse = authController.getAuthResponse(authRequest);
        Assertions.assertNotNull(authResponse);
    }
}
