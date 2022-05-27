package com.cognizant.capybarasfems.ControllerTests;

import com.cognizant.capybarasfems.Controller.AuthController;
import com.cognizant.capybarasfems.Models.AuthRequest;
import com.cognizant.capybarasfems.Models.AuthResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthControllerTest {

    private AuthController authController;

    @BeforeEach
    public void setUp() {
        authController = new AuthController();
    }

    @Test
    public void getAuthResponseTest() {
        AuthRequest authRequest = new AuthRequest();
        AuthResponse authResponse = authController.getAuthResponse(authRequest);
        Assertions.assertNotNull(authResponse);
    }
}
