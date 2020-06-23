package org.xbp.springbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("xbp.springbootstarter")
public class StarterServiceProperties {

    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }
}
