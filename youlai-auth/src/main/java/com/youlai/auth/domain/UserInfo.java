package com.youlai.auth.domain;

import lombok.Data;

/**
 * 描述: [微信用户信息]
 * @date 2021/6/8
 *
 * @author haoxianrui
 */
@Data
public class UserInfo {

    private String avatarUrl;

    private String city;

    private String country;

    private Integer gender;

    private String language;

    private String nickName;

    private String province;

}
