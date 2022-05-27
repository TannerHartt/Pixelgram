package com.cognizant.capybarasfems.Clients;

import com.cognizant.capybarasfems.Models.AuthRequest;
import com.cognizant.capybarasfems.Models.AuthResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(value= "AuthClient", url="https://enablement-keycloak.work.cognizant.studio//auth/realms/SpringBootKeycloak/protocol/openid-connect/token")
public interface AuthFeignClient {
    @GetMapping("/token")
    AuthResponse AuthClient(@RequestBody AuthRequest body);
}
