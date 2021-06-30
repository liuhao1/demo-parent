package com.zto.consumer.filter;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import com.zto.consumer.dto.VaildRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @ProjectName: demo-parent
 * @Description: dubbo校验实现
 * @Author: liuhao
 * @CreateDate: 2020/12/8 18:36
 * @Version: 1.0
 */
@Slf4j
@Activate(group = {Constants.PROVIDER}, order = 1)
public class ValidationFilter implements Filter {
    @Autowired
    private Validator validator;

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        //实现校验
        Set<ConstraintViolation<String>> validate = validator.validate(invocation.getMethodName(),invocation.getParameterTypes());
        validate.forEach(e ->{
            log.info(e.getMessage());
        });

        return invoker.invoke(invocation);
    }
}
