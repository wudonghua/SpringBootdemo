package com.cn.springboot.service.impl;

import org.springframework.stereotype.Service;

import java.io.PipedOutputStream;

/**
 * Created by dw07 on 2017/5/2.
 */
@Service
public class RInputStream extends Thread {
    private PipedOutputStream out = new PipedOutputStream();

    public PipedOutputStream getOut() {
        return out;
    }

    @Override
    public void run() {

        String s = "hello world";

        try {
            for(int i = 0;i<10;i++){
                out.write(s.getBytes());
                out.close();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

