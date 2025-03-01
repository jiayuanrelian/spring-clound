package com.yto.project.config;

import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.event.JobEventConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import com.yto.project.job.listener.ElasticJobCommonListerner;
import com.yto.project.job.simple.SimpleElasticJob;
import com.yto.project.job.simple.SimpleElasticJobTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class SimpleJobConfig {
    
    @Resource
    private ZookeeperRegistryCenter regCenter;

    @Resource
    private JobEventConfiguration jobEventConfiguration;

    @Resource
    private ElasticJobCommonListerner elasticJobCommonListerner;

//    @Bean
//    public SimpleJob simpleJob() {
//        return new SimpleElasticJob();
//    }
//
//    @Bean
//    public SimpleJob simpleJobTwo() {
//        return new SimpleElasticJobTwo();
//    }

    @Autowired
    private SimpleElasticJob simpleJob;

    @Autowired
    private SimpleElasticJobTwo simpleJobTwo;
    
    @Bean(initMethod = "init")
    public JobScheduler simpleJobScheduler(@Value("${simpleJob.cron}") final String cron, @Value("${simpleJob.shardingTotalCount}") final int shardingTotalCount,
                                           @Value("${simpleJob.shardingItemParameters}") final String shardingItemParameters) {
        return new SpringJobScheduler(simpleJob, regCenter, getLiteJobConfiguration(simpleJob.getClass(), cron, shardingTotalCount, shardingItemParameters),jobEventConfiguration,elasticJobCommonListerner);
    }

    @Bean(initMethod = "init")
    public JobScheduler simpleJobSchedulerTwo(@Value("${simpleJobTwo.cron}") final String cron, @Value("${simpleJobTwo.shardingTotalCount}") final int shardingTotalCount,
                                           @Value("${simpleJobTwo.shardingItemParameters}") final String shardingItemParameters) {
        return new SpringJobScheduler(simpleJobTwo, regCenter, getLiteJobConfiguration(simpleJobTwo.getClass(), cron, shardingTotalCount, shardingItemParameters),jobEventConfiguration,elasticJobCommonListerner);
    }
    
    private LiteJobConfiguration getLiteJobConfiguration(final Class<? extends SimpleJob> jobClass, final String cron, final int shardingTotalCount, final String shardingItemParameters) {
        return LiteJobConfiguration.newBuilder(new SimpleJobConfiguration(JobCoreConfiguration.newBuilder(
                jobClass.getName(), cron, shardingTotalCount).shardingItemParameters(shardingItemParameters).build(), jobClass.getCanonicalName())).overwrite(true).build();
    }
}