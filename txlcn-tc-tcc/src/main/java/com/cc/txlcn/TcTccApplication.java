package com.cc.txlcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;

/**
 * lcn的tcc依赖Consul(SpringCloud) ZooKeeper(Dubbo)
 * @package: com.cc.txlcn
 * @author: 陈昌
 * @date: 2019年4月10日 下午5:21:47
 * @version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableDistributedTransaction
@EnableFeignClients
public class TcTccApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcTccApplication.class, args);
	}
}
