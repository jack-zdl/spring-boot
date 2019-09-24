package com.ceying.chx.cpi.base.dao;

import com.ceying.chx.cpi.base.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

/**
 * <p></p>
 *
 * @Author: dl.zhang
 * @Date: 2019/9/24
 */
public interface  UserRepository extends ReactiveCrudRepository<User, String> {
    Mono<User> findByUsername(String username);     // 2
    Mono<Long> deleteByUsername(String username);
}
