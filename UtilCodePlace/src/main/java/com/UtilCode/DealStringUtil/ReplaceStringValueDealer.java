package com.UtilCode.DealStringUtil;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author chenxin
 * @date 2023/05/17 16:10
 */
@Component
@Aspect
public class ReplaceStringValueDealer {

    @Around("@annotation(com.UtilCode.DealStringUtil.Replace)")
    public void ReplaceStringValue(ProceedingJoinPoint point) {
        Object[] args = point.getArgs();
        for (Object arg : args) {

        }
    }
}
