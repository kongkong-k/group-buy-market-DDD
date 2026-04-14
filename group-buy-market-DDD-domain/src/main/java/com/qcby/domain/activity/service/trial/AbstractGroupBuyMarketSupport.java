package com.qcby.domain.activity.service.trial;


import com.qcby.domain.activity.adapter.repository.IActivityRepository;
import com.qcby.types.design.framework.tree.AbstractMultiThreadStrategyRouter;
import com.qcby.types.design.framework.tree.StrategyHandler;

import javax.annotation.Resource;

public abstract class AbstractGroupBuyMarketSupport<MarketProductEntity, DynamicContext, TrialBalanceEntity> extends AbstractMultiThreadStrategyRouter<MarketProductEntity, DynamicContext, TrialBalanceEntity> {


//    @Override
//    protected TrialBalanceEntity doApply(MarketProductEntity requestParameter, DynamicContext dynamicContext) throws Exception {
//        return router(requestParameter, dynamicContext);
//    }
//
//    @Override
//    public StrategyHandler<MarketProductEntity, DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DynamicContext dynamicContext) throws Exception {
//        return null;
//    }

    protected long timeout = 5000;

    @Resource
    protected IActivityRepository repository;

    @Override
    protected void multiThread(MarketProductEntity requestParameter, DynamicContext dynamicContext) throws Exception {
        // 缺省实现
    }


}
