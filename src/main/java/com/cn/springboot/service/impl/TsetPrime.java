package com.cn.springboot.service.impl;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.time.LocalDate;

/**
 * Created by dw07 on 2017/5/2.
 */
public class TsetPrime {
    private final int SIZE = 1024;
    byte[] byteArray = null;
    private BufferedInputStream bis = null;
    private BufferedOutputStream bos = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;
    private String inPutName = "D:/lg36501000004320150723.zip";
    private String OutPutName = "D:/putStream/";
    private int p = 100;
    private int s = 10;
    FileInputStream input = null;
    FileWriter fw = null;
    FileReader fr = null;
    public TsetPrime() {
        File f = new File(OutPutName);
        if (!f.exists()) {
            f.mkdir();
        }
        try {
            input = new FileInputStream(inPutName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 判断是否是质数
     * 质数:大于1的自然数除了1和他本身以外不能再有别的因数
     *
     * @param n
     * @return
     */
    public Boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {//过滤自然数
            return n % i != 0;
        }
        return true;
    }

    public void printPrime(byte[] bytes) {
        LocalDate ldt = LocalDate.now();
        try {
            bos = new BufferedOutputStream(new FileOutputStream(OutPutName+ldt+".zip"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            bos.write(bytes);
            bos.flush();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public byte[] getPrime(HttpServletRequest request) {

        //将字节流转缓冲流

        try (OutputStream out = new FileOutputStream("d:/xxx.zip")){
           InputStream is = request.getInputStream();
            byte[] buf = new byte[1024];
//            OutputStream out = new FileOutputStream("d:/xxx.zip");
            int len;
            while((len = is.read(buf))!=-1){
                out.write(buf, 0, len);
                out.flush();
            }
//            out.close();
            /*bis = new BufferedInputStream(input, 1024 * SIZE);
//            bis = new BufferedInputStream(request.getInputStream(), 1024 * SIZE);
//            StringBuilder sb = new StringBuilder();
//            BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
//            String line = null;
//            while ((line = br.readLine()) != null) {
//                sb.append(line);
//            }
//            return sb.toString().getBytes("UTF-8");

            int c = 0;
            int bisLength = bis.available();
            int readLength = 0;

            byteArray = new byte[bis.available()];
            int tmp = 0;
            while ((tmp = bis.read(byteArray)) != -1) {
                System.out.println("每次读取字节数量:" + tmp);
                System.out.println("文件中剩余字节数:" + input.available());
            }*/
//            return byteArray;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArray;

    }

    public void getRead() throws IOException {
//        try {
//            fr =new FileReader(inPutName);
//            fw = new FileWriter(OutPutName+LocalDate.now().toString()+".zip");
//            br = new BufferedReader(fr, 1024 * SIZE);
//            bw = new BufferedWriter(fw);
//            String line = null;
//            while ((line = br.readLine()) != null) {
//                bw.write(line);
//                bw.newLine();
//                bw.flush();
//            }
//        } catch(IOException e){
//            e.printStackTrace();
//        }finally {
//            br.close();
//            bw.close();
//        }
    }
}
