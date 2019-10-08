package com.yto.project.job.simple;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SimpleElasticJobTwo implements SimpleJob {

    @Override
    public void execute(ShardingContext content) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int key = content.getShardingItem();
        System.out.println("----------------------"+simpleDateFormat.format(new Date())+"===="+ key+"-------------------");
        System.out.println(" ");
        System.out.println(" ");
    }
}
