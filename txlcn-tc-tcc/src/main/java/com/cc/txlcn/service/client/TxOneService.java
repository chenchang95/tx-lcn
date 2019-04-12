package com.cc.txlcn.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="txlcn-tc-one")
public interface TxOneService {

	@RequestMapping("/one/insert")
	String insert(@RequestParam("name") String name);
}
