package com.nfsq.yqf.springcloud_zk_member.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by qfyu
 * Date:2018/11/30
 * Time:16:19
 **/
@FeignClient("zk-member")
public interface MemberService {
    @RequestMapping("/member")
    String getMember(@RequestParam("member") String member);
}
