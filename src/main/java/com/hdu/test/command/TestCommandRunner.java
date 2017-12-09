package com.hdu.test.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by CTWLPC on 2017/9/12.
 */
@Component
@Order(value = 1)
public class TestCommandRunner implements CommandLineRunner{

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("++++++++++++++++++++++++");
    }
}
