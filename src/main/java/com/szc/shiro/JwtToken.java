package com.szc.shiro;/**
 * @author T-Rex
 * @date 2021/11/21 - 22:38
 */

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @program:myblog
 *@description:
 *@author:31933
 @date:2021-11-21 22:38:36
 */
public class JwtToken implements AuthenticationToken {
    private String token;
    public JwtToken(String token) {
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }
    @Override
    public Object getCredentials() {
        return token;
    }
}

