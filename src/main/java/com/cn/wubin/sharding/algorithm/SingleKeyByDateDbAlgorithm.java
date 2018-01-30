package com.cn.wubin.sharding.algorithm;

import com.cn.wubin.sharding.util.DateUtil;
import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.database.SingleKeyDatabaseShardingAlgorithm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collection;
import java.util.Date;

public class SingleKeyByDateDbAlgorithm implements SingleKeyDatabaseShardingAlgorithm<Date> {

    private Logger logger = LogManager.getLogger(SingleKeyByDateTbAlgorithm.class);

    @Override
    public String doEqualSharding(Collection<String> collection, ShardingValue<Date> shardingValue) {
        //201707到2017010在db0；201711到201803在db1
        Date createDate = shardingValue.getValue();
        String formatDate = DateUtil.getDateMonthString(createDate);
        String dbFalg = "0";
        //测试用
        if("201707".equals(formatDate)||"201708".equals(formatDate)||
           "201709".equals(formatDate)||"201710".equals(formatDate)){
            dbFalg = "0";
        }else{
            dbFalg = "1";
        }
        for (String each : collection) {
            if (each.endsWith(dbFalg)) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection<String> doInSharding(Collection<String> collection, ShardingValue<Date> shardingValue) {
        return null;
    }

    @Override
    public Collection<String> doBetweenSharding(Collection<String> collection, ShardingValue<Date> shardingValue) {
        return null;
    }
}