package com.zto.consumer;

import com.zto.titans.common.entity.Result;

/**
 * @ProjectName: demo-parent
 * @Description: 测试短信中心接口
 * @Author: liuhao
 * @CreateDate: 2020/4/1 13:02
 * @Version: 1.0
 */

public interface MessageService {

    Result getGuidanceTagByPhone();

}
