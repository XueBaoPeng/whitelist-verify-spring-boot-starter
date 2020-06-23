package com.xbp.start.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("xbp.start")
public class StarterServiceProperties {

    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }
}
