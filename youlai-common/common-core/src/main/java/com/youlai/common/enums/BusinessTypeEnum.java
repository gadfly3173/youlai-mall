package com.youlai.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author <a href="mailto:xianrui0365@163.com">xianrui</a>
 * @date 2021-02-17
 */
public enum BusinessTypeEnum {

    USER("user", 100),
    MEMBER("member", 200),
    ORDER("order", 300);

    @Getter
    @Setter
    private String code;

    @Getter
    @Setter
    private Integer value;

    BusinessTypeEnum(String code, Integer value) {
        this.code = code;
        this.value = value;
    }

    public static BusinessTypeEnum getValue(String code) {
        for (BusinessTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}
