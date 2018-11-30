package com.nfsq.yqf.springcloud_zk_member.controller;

import com.nfsq.yqf.springcloud_zk_member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qfyu
 * Date:2018/11/30
 * Time:16:21
 **/
@RestController
public class MainController {
    @Autowired
    MemberService memberService;
    @RequestMapping("/getMember")
    public String get(String member){
        return memberService.getMember(member);
    }
}
