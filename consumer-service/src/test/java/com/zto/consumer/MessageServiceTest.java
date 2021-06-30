package com.zto.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zto.consumer.ConsumerApplication;
import com.zto.crm.basic.common.base.ResultResponse;
import com.zto.crm.regulation.rule.dto.TagResultResponse;
import com.zto.crm.regulation.tag.UserTagQueryService;
import com.zto.crm.regulation.tag.dto.UserTagQueryWithAddressInput;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.tags.form.InputTag;

import static org.junit.Assert.*;

/**
 * @ProjectName: demo-parent
 * @Description:
 * @Author: liuhao
 * @CreateDate: 2020/4/1 14:19
 * @Version: 1.0
 */
//@Profile("fat")
//@ActiveProfiles("fat")
//@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerApplication.class)
public class MessageServiceTest {
    @Reference(group = "tag", version = "1.1.0")
    private UserTagQueryService userTagQueryService;

    @Test
    public void getGuidanceTagByPhone() {
        UserTagQueryWithAddressInput input = new UserTagQueryWithAddressInput();
        input.setAddress("华南路555号");
        input.setCityId(310100);
        input.setDistrictId(310118);
        input.setPhone("13270793055");
        input.setProvId(310000);
        input.setTargetDef("CChannelAndOrder");
        ResultResponse<TagResultResponse> resultResponseResultResponse = userTagQueryService.getGuidanceTagByPhone(input);
        System.out.println("success");
    }
}