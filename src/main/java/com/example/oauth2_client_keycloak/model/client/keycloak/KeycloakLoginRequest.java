package com.example.oauth2_client_keycloak.model.client.keycloak;

import lombok.Data;

/**
 * @Author Md. Aslam Hossain
 * @Date Oct 07, 2022
 */
@Data
public class KeycloakLoginRequest {

    private String username;
    private String password;

}