package com.yzkj.example;

import com.yzkj.example.api.UserClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = {UserClient.class})
public class DeptApplication {
    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext application = SpringApplication.run(DeptApplication.class, args);
        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
//        String property = env.getProperty("");
        System.out.println(
                "\n\t" +
                        "--------------------------------------\n\t" +
                        "Application is running! Access URLs: \n\t" +
                        "Local: \t\t http://localhost:" + port + "/\n\t"
        );
    }
}