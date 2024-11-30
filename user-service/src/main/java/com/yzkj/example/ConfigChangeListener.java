package com.yzkj.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// 用于监听nacos读取数据失败的事件。
@RefreshScope
@Component
public class ConfigChangeListener  implements ApplicationListener<EnvironmentChangeEvent> {

    @Value("${bady.name:This is your baby name...}")
    private String badyName;

    @Override
    public void onApplicationEvent(EnvironmentChangeEvent event) {
        if (event.getKeys().contains("bady.name")) {
            System.out.println("能够读取配置文件");
        }
    }

    @Override
    public boolean supportsAsyncExecution() {
        return ApplicationListener.super.supportsAsyncExecution();
    }
}
