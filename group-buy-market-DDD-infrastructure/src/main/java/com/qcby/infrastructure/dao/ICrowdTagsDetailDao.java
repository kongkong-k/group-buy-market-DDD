package com.qcby.infrastructure.dao;

import com.qcby.infrastructure.dao.po.CrowdTagsDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description 人群标签明细
 */
@Mapper
public interface ICrowdTagsDetailDao {

    void addCrowdTagsUserId(CrowdTagsDetail crowdTagsDetailReq);

}
