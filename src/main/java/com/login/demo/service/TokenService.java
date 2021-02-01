package com.login.demo.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.login.demo.po.User;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ProjectName: Test
 * @Package: com.login.demo.service
 * @ClassName: TokenService
 * @Author: qiuhen
 * @Description: 返回token
 * @Date: 2021/1/31 19:32
 * @Version: 1.0
 */
@Service
public class TokenService {
    public String getToken(User user) {
        Date start = new Date();
        long currentTime = System.currentTimeMillis() + 60 * 60 * 1000;//一小时有效时间
        Date end = new Date(currentTime);
        String token = "";

        token = JWT.create().withAudience(user.getId()).withIssuedAt(start).withExpiresAt(end)
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}
