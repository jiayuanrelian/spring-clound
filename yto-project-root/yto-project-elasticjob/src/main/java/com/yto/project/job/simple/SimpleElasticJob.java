package com.yto.project.job.simple;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SimpleElasticJob implements SimpleJob {

    @Override
    public void execute(ShardingContext content) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int key = content.getShardingItem();
        System.out.println("----------------------"+simpleDateFormat.format(new Date())+"===="+ key+"-------------------");
        switch (key) {
            case 0:
                System.out.println(simpleDateFormat.format(new Date())+"任务调度执行3: "+key);
                break;
            case 1:
                System.out.println(simpleDateFormat.format(new Date())+"任务调度执行3: "+key);
                break;
            case 2:
                System.out.println(simpleDateFormat.format(new Date())+"任务调度执行3: "+key);
                break;

            default:
                System.out.println(simpleDateFormat.format(new Date())+"没有任务调度执行");
                break;
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
