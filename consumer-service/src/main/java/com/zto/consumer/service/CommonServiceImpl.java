package com.zto.consumer.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zto.consumer.CommonService;
import com.zto.consumer.dto.VaildRequest;
import com.zto.titans.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @ProjectName: demo-parent
 * @Description: 一般测试方法
 * @Author: liuhao
 * @CreateDate: 2020/12/8 12:23
 * @Version: 1.0
 */
@Slf4j
@Service(version = "1.0")
public class CommonServiceImpl implements CommonService {

    @Autowired
    private Validator validator;

    @Override
    public Result testVaild(VaildRequest request) {
        try {
            Set<ConstraintViolation<VaildRequest>> validate = validator.validate(request);
            validate.forEach(e ->{
                log.info(e.getMessage());
            });

//            Validator bean = IocContext.getContext().getBean(Validator.class);
//            Set<ConstraintViolation<VaildRequest>> validate1 = bean.validate(request);
            log.info("success!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return Result.success();
    }


}
