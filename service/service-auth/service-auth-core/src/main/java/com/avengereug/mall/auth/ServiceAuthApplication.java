package com.avengereug.mall.auth;

import com.avengereug.mall.common.anno.StartApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;


@StartApplication
@EnableRedisHttpSession
@EnableFeignClients(basePackages = {
        "com.avengereug.mall.auth.thirdpart.client",
        "com.avengereug.mall.member.feign"
})
public class ServiceAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAuthApplication.class);
    }
}
