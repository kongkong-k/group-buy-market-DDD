package com.qcby.domain.activity.service;

import com.qcby.domain.activity.model.entity.MarketProductEntity;
import com.qcby.domain.activity.model.entity.TrialBalanceEntity;
import com.qcby.domain.activity.model.entity.UserGroupBuyOrderDetailEntity;
import com.qcby.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.qcby.types.design.framework.tree.StrategyHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @description 首页营销服务
 */
@Service
public class IndexGroupBuyMarketServiceImpl implements IIndexGroupBuyMarketService {

    @Resource
    private DefaultActivityStrategyFactory defaultActivityStrategyFactory;
//    @Resource
//    private IActivityRepository repository;

    /**
     * 营销试算
     * @param marketProductEntity
     * @return
     * @throws Exception
     */
    @Override
    public TrialBalanceEntity indexMarketTrial(MarketProductEntity marketProductEntity) throws Exception {
        // 获取执行策略
        StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> strategyHandler = defaultActivityStrategyFactory.strategyHandler();
        // 受理试算操作
        return strategyHandler.apply(marketProductEntity, new DefaultActivityStrategyFactory.DynamicContext());
    }

//    @Override
//    public List<UserGroupBuyOrderDetailEntity> queryInProgressUserGroupBuyOrderDetailList(Long activityId, String userId, Integer ownerCount, Integer randomCount) {
//        List<UserGroupBuyOrderDetailEntity> unionAllList = new ArrayList<>();
//
//        // 查询个人拼团数据
//        if (0 != ownerCount) {
//            List<UserGroupBuyOrderDetailEntity> ownerList = repository.queryInProgressUserGroupBuyOrderDetailListByOwner(activityId, userId, ownerCount);
//            if (null != ownerList && !ownerList.isEmpty()){
//                unionAllList.addAll(ownerList);
//            }
//        }
//
//        // 查询其他非个人拼团
//        if (0 != randomCount) {
//            List<UserGroupBuyOrderDetailEntity> randomList = repository.queryInProgressUserGroupBuyOrderDetailListByRandom(activityId, userId, randomCount);
//            if (null != randomList && !randomList.isEmpty()){
//                unionAllList.addAll(randomList);
//            }
//        }

//        return unionAllList;
//        return null;
//    }

//    @Override
//    public TeamStatisticVO queryTeamStatisticByActivityId(Long activityId) {
//        return repository.queryTeamStatisticByActivityId(activityId);
//    }

}
