package com.youlai.admin.api.fallback;

import com.youlai.admin.api.UserFeignClient;
import com.youlai.admin.pojo.entity.SysUser;
import com.youlai.common.result.Result;
import com.youlai.common.result.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:xianrui0365@163.com">xianrui</a>
 * @createTime 2021/4/24 21:30
 */
@Component
@Slf4j
public class UserFeignFallbackClient implements UserFeignClient {

    @Override
    public Result<SysUser> getUserByUsername(String username) {
        log.error("feign远程调用系统用户服务异常后的降级方法");
        return Result.failed(ResultCode.DEGRADATION);
    }
}
