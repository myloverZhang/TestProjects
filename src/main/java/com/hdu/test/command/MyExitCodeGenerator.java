package com.hdu.test.command;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * Created by CTWLPC on 2017/10/13.
 */
@Component
public class MyExitCodeGenerator implements ExitCodeGenerator{
    @Override
    public int getExitCode() {
        System.out.println("my application exit...");
        return 0;
    }
}
