package com.cognizant.capybarasfems.ServiceTests;

import com.cognizant.capybarasfems.Clients.AuthFeignClient;
import com.cognizant.capybarasfems.Models.AuthRequest;
import com.cognizant.capybarasfems.Models.AuthResponse;

public class MockAuthClient implements AuthFeignClient {
    @Override
    public AuthResponse AuthClient(AuthRequest body) {
        return new AuthResponse(
                "token",
                1,
                2,
                "refresh_token",
                "token_type",
                3,
                "session_state",
                "scope"
        );
    }
}
