package com.cn.springboot.service.impl;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by dw07 on 2017/4/26.
 */
@Service
public class CebServiceImpl extends Thread{
//    public void test() throws JsonProcessingException {
//        String source = "交易代码|清算日期|交易发生时间|订单号|网关流水号|商户号|终端号|交易金额|手续费(始终 为 0)|净清算金额(交易金额减去手续费金额)|响应码|商户保留 1|商户保留 2|\n交易代码|清算日期|交易发生时间|订单号|网关流水号|商户号|终端号|交易金额|手续费(始终 为 0)|净清算金额(交易金额减去手续费金额)|响应码|商户保留 1|商户保留 2|\n交易代码|清算日期|交易发生时间|订单号|网关流水号|商户号|终端号|交易金额|手续费(始终 为 0)|净清算金额(交易金额减去手续费金额)|响应码|商户保留 1|商户保留 2|\n共有 XXXXXXXX 条记录 ";
//        String[] split1 = source.split("\n");
//        for (String ss :split1){
//            if(ss.contains("|")){
//                String[] split = ss.split("\\|");
//                for (String s:split) {
//                    System.out.println(s);
//                }
//            }
//
//
//        }
//
//
//
//        System.out.println(source);
//
//    }
    private PipedInputStream in;
    public CebServiceImpl(RInputStream sender) throws IOException {
        in = new PipedInputStream(sender.getOut());
    }
    @Override
    public void run() {
        try {
            int data;
            while((data=in.read())!=-1){
                System.out.print((char)data);
            }
            in.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
//    public static void main(String[] args) throws IOException {
//        Sender sender = new Sender();
//        Receiver r = new Receiver(sender);
//        sender.start();
//        r.start();
//    }

}
