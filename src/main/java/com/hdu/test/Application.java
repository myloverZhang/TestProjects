package com.hdu.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

/**
 * Created by CTWLPC on 2017/8/28.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws IOException {
//        File file = new File("E:\\test.txt");
//        System.out.println(file.length());
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//        String line = reader.readLine();
//        while (line!=null){
//            System.out.println(line);
//            line = reader.readLine();
//        }
        SpringApplication.run(Application.class);

    }
}
