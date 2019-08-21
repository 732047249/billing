package com.yeecall.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisException;
@Service
public class redisservice {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    boolean set(){
//        redisTemplate.opsForValue().set();
        Jedis jedis = null;
        try {
            jedis = new Jedis();
            String v = "key";
            jedis.publish("key", v);
        } catch (JedisException e) {
            return false;
//          jedis = null;
            throw e;
        } finally {
            return false;
        }

    }
}
