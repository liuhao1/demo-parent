package com.zto.consumer.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @ProjectName: zto-open-platform
 * @Description: 测试
 * @Author: liuhao
 * @CreateDate: 2020/12/8 9:13
 * @Version: 1.0
 */
@Data
public class VaildRequest implements Serializable {
    private static final long serialVersionUID = -6571399539884782711L;

    @NotEmpty(message= "var1 不能为空")
    private String var1;

    @NotNull(message= "var2 不能为null")
    private Integer var2;

    @NotNull(message= "var2 不能为null")
    private Boolean var3;
}
