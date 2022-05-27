package com.cognizant.capybarasfems.Controller;

import com.cognizant.capybarasfems.Models.AuthRequest;
import com.cognizant.capybarasfems.Models.AuthResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AuthController {

    //@Autowired
    //public AuthService authService;

    private String client_id = "capybaras";
    private String grant_type = "password";

    public AuthController() { }

    @PostMapping("/auth/token")
    public AuthResponse getAuthResponse(@RequestBody AuthRequest authRequest) {
        authRequest.setClient_id(client_id);
        authRequest.setGrant_type(grant_type);
        //authService.login(authRequest);
        return new AuthResponse();
    }

}
