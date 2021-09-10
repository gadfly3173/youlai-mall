package com.youlai.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @date 2021/6/8
 * @author haoxianrui
 */

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class OAuthToken {

    private String access_token;

    private String token_type = "bearer";

    public OAuthToken accessToken(String accessToken) {
        this.access_token = accessToken;
        return this;
    }

    public OAuthToken tokenType(String tokenType) {
        this.token_type = tokenType;
        return this;
    }

}
