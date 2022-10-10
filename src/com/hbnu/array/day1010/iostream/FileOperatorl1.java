package com.hbnu.array.day1010.iostream;

import java.io.File;
import java.io.IOException;

/**
 * @author luanhao
 * @date 2022年10月10日 10:09
 */
public class FileOperatorl1 {
    public static void main(String[] args) {

        String fileName = "D:\\Project\\Java\\class13\\class13.txt";

        File file = new File(fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("文件创建异常……");
            }
        } else {
            System.out.println("文件已存在!!!");
        }

    }
}
