package com.yzkj.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.util.Objects;

@SpringBootApplication
@EnableDiscoveryClient
public class UserApplication {
    public static void main(String[] args) throws Exception {
        //添加环境变量
        System.setProperty("spring.cloud.bootstrap.enabled", "true");
        ConfigurableApplicationContext application = SpringApplication.run(UserApplication.class, args);
        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
//        String profile = env.getProperty("spring.cloud.nacos.config.shared-config[0].data-id");
//        System.out.println(profile);
        System.out.println(
                "\n\t" +
                        "--------------------------------------\n\t" +
                        "Application is running! Access URLs: \n\t" +
                        "Local: \t\t http://localhost:" + port + "/\n\t"
        );
    }
}