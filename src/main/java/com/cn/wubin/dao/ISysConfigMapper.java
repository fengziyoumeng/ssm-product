package com.cn.wubin.dao;

import com.cn.wubin.model.pojo.SysConfig;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ISysConfigMapper {
    /**
     *
     * @mbggenerated 2018-01-20
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-20
     */
    int insert(SysConfig record);

    /**
     *
     * @mbggenerated 2018-01-20
     */
    int insertSelective(SysConfig record);

    /**
     *
     * @mbggenerated 2018-01-20
     */
    SysConfig selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-20
     */
    int updateByPrimaryKeySelective(SysConfig record);

    /**
     *
     * @mbggenerated 2018-01-20
     */
    int updateByPrimaryKey(SysConfig record);

    List<SysConfig> listSysConfig(Map<String,Object> map);
}