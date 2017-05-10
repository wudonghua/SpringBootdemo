package com.cn.springboot.source.jedis;

import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.PostConstruct;
import java.util.Objects;

/**
 * Created by dw07 on 2017/5/8.
 */
@Configuration
public class JedisConfig {
   private static JedisPool pool = null;
    Jedis jedis;
    @PostConstruct
    public static JedisPool poolClain(){
        if (Objects.isNull(pool)) {
            JedisPoolConfig poolConfig = new JedisPoolConfig();
            //控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；
            //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
            poolConfig.setMaxTotal(500);
            //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例。
            poolConfig.setMaxIdle(5);
            //表示当borrow(引入)一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException；
            poolConfig.setMaxWaitMillis(1000*100);
            //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
            poolConfig.setTestOnBorrow(true);
            pool = new JedisPool(poolConfig, "10.66.53.19", 1063);
        }
        return pool;
    }

    public static void returnResource(JedisPool pool,Jedis jedis){
        if(!Objects.isNull(pool)){
            pool.returnResource(jedis);
        }
    }

    public static String getValue(String key){
        String value = null;
        JedisPool pool = null;
        Jedis jedis = null;
        try {
            pool = poolClain();
            jedis = pool.getResource();
             value=  jedis.get(key);
        }catch (Exception e){
            e.printStackTrace();
            returnResource(pool,jedis);
        }finally {
            returnResource(pool,jedis);
        }
        return value;
    }

    public static void setValue(String key ,String value){
        JedisPool pool = null;
        Jedis jedis = null;
        try {
            pool = poolClain();
            jedis = pool.getResource();
            jedis.set(key, value);
        }catch (Exception e) {
            assert pool != null;
            pool.returnBrokenResource(jedis);
            e.printStackTrace();
        }finally {
            returnResource(pool, jedis);
        }


    }


}
