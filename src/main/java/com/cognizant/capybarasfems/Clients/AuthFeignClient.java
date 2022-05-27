package com.cognizant.capybarasfems.Clients;

import com.cognizant.capybarasfems.Models.AuthRequest;
import com.cognizant.capybarasfems.Models.AuthResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//fetching the api token from keycloak for authentication of client
@FeignClient(value= "AuthClient",
        url="https://enablement-keycloak.work.cognizant.studio/auth/realms/Enablement/protocol/openid-connect/token")
public interface AuthFeignClient {
    @PostMapping
    AuthResponse AuthClient(@RequestBody AuthRequest body);
}
