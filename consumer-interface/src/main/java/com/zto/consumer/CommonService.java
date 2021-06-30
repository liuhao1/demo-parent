package com.zto.consumer;

import com.zto.consumer.dto.VaildRequest;
import com.zto.titans.common.entity.Result;

/**
 * @ProjectName: demo-parent
 * @Description: 一般测试方法
 * @Author: liuhao
 * @CreateDate: 2020/12/8 12:23
 * @Version: 1.0
 */
public interface CommonService {

    Result testVaild(VaildRequest request);
}
