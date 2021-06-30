package com.zto.consumer.swg.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zto.consumer.CommonService;
import com.zto.consumer.dto.VaildRequest;
import com.zto.titans.common.entity.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: base-parent
 * @Description: 点评相关的测试swgger
 * @Author: liuhao
 * @CreateDate: 2020/11/23 16:03
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "comments", method = RequestMethod.POST)
public class CommentsController {
    @Reference(version ="1.0",check = false)
    private CommonService commonService;

    @RequestMapping("/testVaild")
    @ApiOperation(value = "测试校验")
    public Result testVaild(@RequestBody VaildRequest request) {
        Result result = commonService.testVaild(request);
        return result;
    }


}
