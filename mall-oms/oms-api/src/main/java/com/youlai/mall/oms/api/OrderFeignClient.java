package com.youlai.mall.oms.api;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author <a href="mailto:xianrui0365@163.com">xianrui</a>
 * @description TODO
 * @createTime 2021/3/13 11:59
 */
@FeignClient("mall-oms")
public interface OrderFeignClient {
}
