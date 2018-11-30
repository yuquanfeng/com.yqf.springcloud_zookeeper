package com.nfsq.yqf.springcloud_zk_order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qfyu
 * Date:2018/11/30
 * Time:16:17
 **/
@RestController
public class MemberController {
    @RequestMapping("/member")
    public String getMember(@RequestParam String member){
        return "调用服务成功，member:"+member;
    }
}
