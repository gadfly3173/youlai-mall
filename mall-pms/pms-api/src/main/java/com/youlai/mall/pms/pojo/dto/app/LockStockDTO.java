package com.youlai.mall.pms.pojo.dto.app;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description 锁定库存
 * @author <a href="mailto:xianrui0365@163.com">xianrui</a>
 * @createTime 2021-03-07 15:14
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LockStockDTO  {

    private Long skuId;

    private Integer count;

    private String orderToken;

    private Boolean locked;

}
