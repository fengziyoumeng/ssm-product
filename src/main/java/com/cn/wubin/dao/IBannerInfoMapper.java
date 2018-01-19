package com.cn.wubin.dao;

import com.cn.wubin.model.pojo.BannerInfo;
import org.springframework.stereotype.Repository;

@Repository //没有这个会被Resource/authwised引入时会报红，尽管不影响正常使用
public interface IBannerInfoMapper {
    /**
     *
     * @mbggenerated 2018-01-17
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-17
     */
    int insert(BannerInfo record);

    /**
     *
     * @mbggenerated 2018-01-17
     */
    int insertSelective(BannerInfo record);

    /**
     *
     * @mbggenerated 2018-01-17
     */
    BannerInfo selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-17
     */
    int updateByPrimaryKeySelective(BannerInfo record);

    /**
     *
     * @mbggenerated 2018-01-17
     */
    int updateByPrimaryKey(BannerInfo record);
}