package com.cognizant.capybarasfems.Controller;

import com.cognizant.capybarasfems.Models.AuthRequest;
import com.cognizant.capybarasfems.Models.AuthResponse;
import com.cognizant.capybarasfems.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "${ui.UI_URL}", allowCredentials = "true")
@RestController
@RequestMapping("/")
public class AuthController {

    @Autowired
    public AuthService authService;

    final private String client_id = "capybaras";
    final private String grant_type = "password";

    public AuthController() { }

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/auth/token")
    public AuthResponse getAuthResponse(@RequestBody AuthRequest authRequest) {
        authRequest.setClient_id(client_id);
        authRequest.setGrant_type(grant_type);
        return authService.requestAuth(authRequest);
        //return new AuthResponse();
    }

}
