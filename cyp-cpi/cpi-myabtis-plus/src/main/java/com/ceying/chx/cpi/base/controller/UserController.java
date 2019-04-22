package com.ceying.chx.cpi.base.controller;

import com.ceying.chx.cpi.base.entity.Member;
import com.ceying.chx.cpi.base.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户登录
 * @author sam
 *
 */
@RestController
public class UserController {

    @Autowired
    private MemberService memberService;

    @GetMapping("get")
    public void uploadAvatar() throws Exception {
        Member member = this.memberService.selectById("");
    }

}
