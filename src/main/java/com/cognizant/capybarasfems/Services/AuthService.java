package com.cognizant.capybarasfems.Services;

import com.cognizant.capybarasfems.Clients.AuthFeignClient;
import com.cognizant.capybarasfems.Models.AuthRequest;
import com.cognizant.capybarasfems.Models.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private AuthFeignClient client;

    public AuthService(AuthFeignClient client) {
        this.client = client;
    }

    public AuthResponse requestAuth(AuthRequest req) {
        return client.AuthClient(req);
    }

    public AuthResponse requestAuth(String user, String pass) {
        return client.AuthClient(new AuthRequest(
                user,
                pass,
                "capybaras",
                "password"
        ));
    }
}
