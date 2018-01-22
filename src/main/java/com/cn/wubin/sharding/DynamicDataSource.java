package com.cn.wubin.sharding;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {
    private static final Logger logger = LogManager.getLogger(DynamicDataSource.class);


    @Override
    protected Object determineCurrentLookupKey() {
        logger.info("获得的数据源为========>"+ DatabaseContextHolder.getCustomerType());
        return DatabaseContextHolder.getCustomerType();
    }
}


