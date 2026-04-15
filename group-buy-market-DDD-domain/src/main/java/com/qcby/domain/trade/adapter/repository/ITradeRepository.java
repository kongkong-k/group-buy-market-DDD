package com.qcby.domain.trade.adapter.repository;


import com.qcby.domain.activity.model.entity.UserGroupBuyOrderDetailEntity;
import com.qcby.domain.trade.model.aggregate.GroupBuyOrderAggregate;
import com.qcby.domain.trade.model.entity.GroupBuyActivityEntity;
import com.qcby.domain.trade.model.entity.MarketPayOrderEntity;
import com.qcby.domain.trade.model.valobj.GroupBuyProgressVO;

import java.util.List;

/**
 * @description 交易仓储服务接口
 */
public interface ITradeRepository {

    MarketPayOrderEntity queryMarketPayOrderEntityByOutTradeNo(String userId, String outTradeNo);

    MarketPayOrderEntity lockMarketPayOrder(GroupBuyOrderAggregate groupBuyOrderAggregate);

    GroupBuyProgressVO queryGroupBuyProgress(String teamId);

    GroupBuyActivityEntity queryGroupBuyActivityEntityByActivityId(Long activityId);

    Integer queryOrderCountByActivityId(Long activityId, String userId);

//    GroupBuyTeamEntity queryGroupBuyTeamByTeamId(String teamId);
//
//    NotifyTaskEntity settlementMarketPayOrder(GroupBuyTeamSettlementAggregate groupBuyTeamSettlementAggregate);
//
//    boolean isSCBlackIntercept(String source, String channel);
//
//    List<NotifyTaskEntity> queryUnExecutedNotifyTaskList();
//
//    List<NotifyTaskEntity> queryUnExecutedNotifyTaskList(String teamId);
//
//    int updateNotifyTaskStatusSuccess(NotifyTaskEntity notifyTaskEntity);
//
//    int updateNotifyTaskStatusError(NotifyTaskEntity notifyTaskEntity);
//
//    int updateNotifyTaskStatusRetry(NotifyTaskEntity notifyTaskEntity);
//
//    boolean occupyTeamStock(String teamStockKey, String recoveryTeamStockKey, Integer target, Integer validTime);
//
//    void recoveryTeamStock(String recoveryTeamStockKey, Integer validTime);
//
//    NotifyTaskEntity unpaid2Refund(GroupBuyRefundAggregate groupBuyRefundAggregate);
//
//    NotifyTaskEntity paid2Refund(GroupBuyRefundAggregate groupBuyRefundAggregate);
//
//    NotifyTaskEntity paidTeam2Refund(GroupBuyRefundAggregate groupBuyRefundAggregate);
//
//    void refund2AddRecovery(String recoveryTeamStockKey, String orderId);
//
//    List<UserGroupBuyOrderDetailEntity> queryTimeoutUnpaidOrderList();

}
