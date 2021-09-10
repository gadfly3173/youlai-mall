package com.youlai.auth.service;

import com.youlai.auth.domain.OAuthToken;
import com.youlai.auth.domain.UserInfo;

/**
 * 描述: [类型描述]
 * @date 2021/6/8
 *
 * @author haoxianrui
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public interface IAuthService {

    OAuthToken login(String code, UserInfo userInfo);
}
