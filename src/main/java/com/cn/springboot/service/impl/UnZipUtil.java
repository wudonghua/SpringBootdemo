package com.cn.springboot.service.impl;

import com.cn.springboot.pojo.CebMerchantClearingParam;
import org.springframework.stereotype.Service;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by dw07 on 2017/5/2.
 */
@Service
public class UnZipUtil {
    private static int k = 1; // 定义递归次数变量   private int k = 1; // 定义递归次数变量
    private static String path;
    public static void zip(String zipFileName, File inputFile) throws Exception {
        System.out.println("压缩中...");
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(
                zipFileName));
        BufferedOutputStream bo = new BufferedOutputStream(out);
        zip(out, inputFile, inputFile.getName(), bo);
        bo.close();
        out.close(); // 输出流关闭
        System.out.println("压缩完成");
    }

    public static void zip(ZipOutputStream out, File f, String base,
                           BufferedOutputStream bo) throws Exception { // 方法重载
        if (f.isDirectory()) {
            File[] fl = f.listFiles();
            if (fl.length == 0) {
                out.putNextEntry(new ZipEntry(base + "/")); // 创建zip压缩进入点base
                System.out.println(base + "/");
            }
            for (int i = 0; i < fl.length; i++) {
                zip(out, fl[i], base + "/" + fl[i].getName(), bo); // 递归遍历子文件夹
            }
            System.out.println("第" + k + "次递归");
            k++;
        } else {
            out.putNextEntry(new ZipEntry(base)); // 创建zip压缩进入点base
            System.out.println(base);
            FileInputStream in = new FileInputStream(f);
            BufferedInputStream bi = new BufferedInputStream(in);
            int b;
            while ((b = bi.read()) != -1) {
                bo.write(b); // 将字节流写入当前zip目录
            }
            bi.close();
            in.close(); // 输入流关闭
        }
    }


    public static void unZip() {
        long l = System.currentTimeMillis();
        try {
            String ld = LocalDate.now().toString();
            // 设定文件源:
            ZipInputStream zis = new ZipInputStream(new FileInputStream("D:/lg36501000004320150723.zip"));
            // 转换为缓存流
            BufferedInputStream bis = new BufferedInputStream(zis, (int) Math.pow(1024, 2));
            // 设定解压目录
            String path = "D:/sssss/";
            File file;
            file = new File(path+ld);
            if (!file.exists()) {
                file.mkdirs();
            }
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null && !entry.isDirectory()) {
                file = new File(path+ld, ld+".txt");
                if (file.exists()) {
                    (new File(file.getParent())).mkdirs();
                }
                FileOutputStream fos = new FileOutputStream(file);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                int b;
                while ((b = bis.read()) != -1) {
                    bos.write(b);
                }
                bos.close();
                fos.close();
                String readerPath =path+ ld + ".txt";
                //读取解压文件
                FileInputStream fis = new FileInputStream(readerPath);
                BufferedReader be = new BufferedReader(new InputStreamReader(fis));
                StringBuilder sb = new StringBuilder();
                String valuSource = null;
                while ((valuSource = be.readLine()) != null) {
                    sb.append(valuSource);
                }
                byte[] bytes = sb.toString().getBytes("UTF-8");
                String s = new String(bytes);
                String[] values = s.split("\n");
                List<CebMerchantClearingParam> list = new ArrayList<>();
                for (String value : values) {
                    if (value.contains("|")) {
                        String[] split = value.split("\\|");
                        CebMerchantClearingParam param;
                        param = new CebMerchantClearingParam(
                                split[0], split[1], split[2], split[3], split[4], split[5],
                                split[6], split[7], split[8], split[9], split[10],
                                split[11], split[12]);
                        list.add(param);
                    }
                }


                System.out.println(file + "解压成功");

            }
            bis.close();
            zis.close();
            long end = System.currentTimeMillis();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 删除目录（文件夹）以及目录下的文件
     *
     * @param sPath 被删除目录的文件路径
     * @return 目录删除成功返回true，否则返回false
     */
    public static boolean deleteDirectory(String sPath) {
        boolean flag;
        //如果sPath不以文件分隔符结尾，自动添加文件分隔符
        if (!sPath.endsWith(File.separator)) {
            sPath = sPath + File.separator;
        }
        File dirFile = new File(sPath);
        //如果dir对应的文件不存在，或者不是一个目录，则退出
        if (!dirFile.exists() || !dirFile.isDirectory()) {
            return false;
        }
        flag = true;
        //删除文件夹下的所有文件(包括子目录)
        File[] files = dirFile.listFiles();
        for (int i = 0; i < files.length; i++) {
            //删除子文件
            if (files[i].isFile()) {
                flag = deleteFile(files[i].getAbsolutePath());
                if (!flag) break;
            } //删除子目录
            else {
                flag = deleteDirectory(files[i].getAbsolutePath());
                if (!flag) break;
            }
        }
        if (!flag) return false;
        //删除当前目录
        if (dirFile.delete()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 根据路径删除指定的目录或文件，无论存在与否
     *
     * @param sPath 要删除的目录或文件
     * @return 删除成功返回 true，否则返回 false。
     */
    public static boolean DeleteFolder(String sPath) {
        boolean flag = false;
        File file = new File(sPath);
        // 判断目录或文件是否存在
        if (!file.exists()) {  // 不存在返回 false
            return flag;
        } else {
            // 判断是否为文件
            if (file.isFile()) {  // 为文件时调用删除文件方法
                return deleteFile(sPath);
            } else {  // 为目录时调用删除目录方法
                return deleteDirectory(sPath);
            }
        }

    }

    /**
     * 删除单个文件
     *
     * @param sPath 被删除文件的文件名
     * @return 单个文件删除成功返回true，否则返回false
     */
    public static boolean deleteFile(String sPath) {
        boolean flag = false;
        File file = new File(sPath);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }

}
