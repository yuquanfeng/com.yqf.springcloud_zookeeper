package com.nfsq.yqf.springcloud_zk_order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudZkOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZkOrderApplication.class, args);
    }
}
