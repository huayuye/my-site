package com.bingdeng.mysite.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 处理session共享问题
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds=3600*24)
public class RedisSessionShareConfig {
}
