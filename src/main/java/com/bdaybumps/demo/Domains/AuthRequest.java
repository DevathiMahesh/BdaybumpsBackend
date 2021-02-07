package com.bdaybumps.demo.Domains;

import org.apache.kafka.common.protocol.types.Field;

public class AuthRequest {
    private String username;
    private String password;
    public AuthRequest()
    {

    }
    public AuthRequest(String username,String password)
    {
        this.username = username;
        this.password = password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
