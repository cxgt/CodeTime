package com.UtilCode.HttpUtil;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface Http {
    String value() default "";

    String appId() default "${default_app_id}";

    String appSecret() default "${default_app_secret}";
}
