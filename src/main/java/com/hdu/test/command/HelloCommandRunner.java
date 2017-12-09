package com.hdu.test.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by CTWLPC on 2017/9/13.
 */
@Component
@Order(value = 3)
public class HelloCommandRunner implements CommandLineRunner{
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("wahhhhhahahahahah");
    }
}
