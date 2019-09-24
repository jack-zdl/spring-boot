package com.ceying.chx.cpi.base.controller;

import com.ceying.chx.cpi.base.entity.User;
import com.ceying.chx.cpi.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * <p></p>
 *
 * @Author: dl.zhang
 * @Date: 2019/9/24
 */
@RestController
@RequestMapping("/user")
public class HelloController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public Mono<User> save(User user) {
        return this.userService.save(user);
    }

    @DeleteMapping("/{username}")
    public Mono<Long> deleteByUsername(@PathVariable String username) {
        return this.userService.deleteByUsername(username);
    }

    @GetMapping("/{username}")
    public Mono<User> findByUsername(@PathVariable String username) {
        return this.userService.findByUsername(username);
    }

    @GetMapping("")
    public Flux<User> findAll() {
        return this.userService.findAll();
    }
//    @GetMapping("/hello")
//    public String hello() {
//        return "Welcome to reactive world ~";
//    }

    @GetMapping("/hello")
    public Mono<String> hello() {   // 【改】返回类型为Mono<String>
        return Mono.just("Welcome to reactive world ~");     // 【改】使用Mono.just生成响应式数据
    }

}
