package com.lxz.junitperf;

import lombok.extern.slf4j.slf4j;

@Slf4j
public class PerfTest {
    public void StringBuilderTest(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i= 0;i<100;++i){
            stringBuilder.append(i);
        }
        log.info（stringBuilder.toString()）;
    }
}
