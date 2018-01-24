package com.cn.wubin.dao;

import com.cn.wubin.model.pojo.ArcCredit;
import org.springframework.stereotype.Repository;

@Repository
public interface IArcCreditMapper {
    /**
     *
     * @mbggenerated 2018-01-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int insert(ArcCredit record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int insertSelective(ArcCredit record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    ArcCredit selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int updateByPrimaryKeySelective(ArcCredit record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int updateByPrimaryKey(ArcCredit record);
}