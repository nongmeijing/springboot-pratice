package com.example.springbootdemo.api.controller;

import com.example.springbootdemo.api.dto.RunInstanceDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author:meijing.nong@hand-china.com
 * @create:2023/9/8 20:19
 **/
@RestController
public class InstanceController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/instance/detail/{instanceId}")
    public RunInstanceDTO hello(@PathVariable("instanceId")
                                        Long instanceId) {
        if (instanceId == null || instanceId / 2 != 0) {
            return null;
        } else {
            RunInstanceDTO runInstanceDTO = new RunInstanceDTO();
            String msg = String.format("demo-instance服务端:%s;实例ID:%s...流程实例描述信息" , serverPort, instanceId);
            runInstanceDTO.setDescription(msg);
            return runInstanceDTO;
        }
    }
}
