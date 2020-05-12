package com.xcs.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author xcs
 * @create 2020-05-08 9:31
 */
@Configuration
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {
}
