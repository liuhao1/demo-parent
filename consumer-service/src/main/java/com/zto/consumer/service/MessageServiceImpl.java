package com.zto.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.zto.consumer.MessageService;
import com.zto.crm.basic.common.base.ResultResponse;
import com.zto.crm.regulation.rule.dto.TagResultResponse;
import com.zto.crm.regulation.tag.UserTagQueryService;
import com.zto.crm.regulation.tag.dto.UserTagQueryWithAddressInput;
import com.zto.titans.common.entity.Result;

/**
 * @ProjectName: demo-parent
 * @Description: 测试短信中心接口
 * @Author: liuhao
 * @CreateDate: 2020/4/1 13:02
 * @Version: 1.0
 */

@Service
public class MessageServiceImpl implements MessageService {
    @Reference(group = "tag", version = "1.1.0")
    private UserTagQueryService userTagQueryService;

    @Override
    public Result getGuidanceTagByPhone() {
        UserTagQueryWithAddressInput input = new UserTagQueryWithAddressInput();
        input.setPhone("18656037036");
        input.setTargetDef("");
//        input.setScenario();
        input.setProvId(0);
        input.setCityId(340100);
        input.setDistrictId(0);
        input.setAddress("锦绣大道");
        ResultResponse<TagResultResponse> resultResponseResultResponse = userTagQueryService.getGuidanceTagByPhone(input);
        return Result.success("success");
    }


}
