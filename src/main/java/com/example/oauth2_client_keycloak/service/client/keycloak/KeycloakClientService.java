package com.example.oauth2_client_keycloak.service.client.keycloak;

import com.example.oauth2_client_keycloak.model.client.LogoutResponse;
import com.example.oauth2_client_keycloak.model.client.keycloak.KeycloakIntrospectResponse;
import com.example.oauth2_client_keycloak.model.client.keycloak.KeycloakLoginRequest;
import com.example.oauth2_client_keycloak.model.client.keycloak.KeycloakLoginResponse;
import com.example.oauth2_client_keycloak.model.client.keycloak.KeycloakTokenRequest;
import org.springframework.http.ResponseEntity;

/**
 * @Author Md. Aslam Hossain
 * @Date Oct 07, 2022
 */
public interface KeycloakClientService {
    ResponseEntity<KeycloakLoginResponse> login(KeycloakLoginRequest keycloakLoginRequest);

    ResponseEntity<LogoutResponse> logout(KeycloakTokenRequest keycloakTokenRequest);

    ResponseEntity<KeycloakIntrospectResponse> introspect(KeycloakTokenRequest keycloakTokenRequest);
}
