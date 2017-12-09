package com.hdu.test.command;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * Created by CTWLPC on 2017/9/13.
 */
@Component
public class PreDestroyRunner {
    @PreDestroy
    public void destroy(){
        System.out.println("dedddddddddddddddddd/////////////////");
    }
}
