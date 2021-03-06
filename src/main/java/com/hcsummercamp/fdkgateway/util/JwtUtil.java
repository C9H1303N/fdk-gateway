package com.hcsummercamp.fdkgateway.util;

import io.jsonwebtoken.*;

public class JwtUtil {

    /**
     * JWT 生成密钥使用的密码
     */
    private static final String SECRET = "fdk.forwarder";

    /**
     * 获取token中的claims信息
     *
     * @param token
     *
     * @return
     */
    private static Jws<Claims> getJws(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token);
    }

    /**
     * 获取payload body信息
     *
     * @param token
     *
     * @return
     */
    public static Claims getClaimsBody(String token) {
        return getJws(token).getBody();
    }
}
