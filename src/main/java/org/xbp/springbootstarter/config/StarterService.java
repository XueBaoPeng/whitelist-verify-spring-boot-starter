package org.xbp.springbootstarter.config;

import org.springframework.util.StringUtils;

/**
 * 用户白名单
 */
public class StarterService {
    private String userStr;
    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.userStr, separatorChar);
    }
}
