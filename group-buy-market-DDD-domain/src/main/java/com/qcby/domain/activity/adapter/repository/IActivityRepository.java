package com.qcby.domain.activity.adapter.repository;


import com.qcby.domain.activity.model.entity.UserGroupBuyOrderDetailEntity;
import com.qcby.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.qcby.domain.activity.model.valobj.SkuVO;

import java.util.List;

/**
 * @description 活动仓储
 */
public interface IActivityRepository {

    GroupBuyActivityDiscountVO queryGroupBuyActivityDiscountVO(String source, String channel);

    SkuVO querySkuByGoodsId(String goodsId);

//    SCSkuActivityVO querySCSkuActivityBySCGoodsId(String source, String channel, String goodsId);
//
//    boolean isTagCrowdRange(String tagId, String userId);
//
//    boolean downgradeSwitch();
//
//    boolean cutRange(String userId);
//
//    List<UserGroupBuyOrderDetailEntity> queryInProgressUserGroupBuyOrderDetailListByOwner(Long activityId, String userId, Integer ownerCount);
//
//    List<UserGroupBuyOrderDetailEntity> queryInProgressUserGroupBuyOrderDetailListByRandom(Long activityId, String userId, Integer randomCount);
//
//    TeamStatisticVO queryTeamStatisticByActivityId(Long activityId);

}
