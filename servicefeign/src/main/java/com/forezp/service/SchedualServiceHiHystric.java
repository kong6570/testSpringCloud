package com.forezp.service;

import org.springframework.stereotype.Component;

/**
 * @author zhangjingzhuan
 * @Description ${TODO}
 * @date 2017/11/16 17:38
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
