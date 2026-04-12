package com.qcby.domain.activity.service.trial.node;

import com.alibaba.fastjson.JSON;
import com.qcby.domain.activity.model.entity.MarketProductEntity;
import com.qcby.domain.activity.model.entity.TrialBalanceEntity;
import com.qcby.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.qcby.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.qcby.types.design.framework.tree.StrategyHandler;
import com.qcby.types.enums.ResponseCode;
import com.qcby.types.exception.AppException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @description 根节点
 */
@Slf4j
@Service
public class RootNode extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {

//    @Resource
//    private SwitchNode switchNode;

    @Override
    public TrialBalanceEntity apply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
//        log.info("拼团商品查询试算服务-RootNode userId:{} requestParameter:{}", requestParameter.getUserId(), JSON.toJSONString(requestParameter));
//        // 参数判断
//        if (StringUtils.isBlank(requestParameter.getUserId()) || StringUtils.isBlank(requestParameter.getGoodsId()) ||
//                StringUtils.isBlank(requestParameter.getSource()) || StringUtils.isBlank(requestParameter.getChannel())) {
//            throw new AppException(ResponseCode.ILLEGAL_PARAMETER.getCode(), ResponseCode.ILLEGAL_PARAMETER.getInfo());
//        }
//        return router(requestParameter, dynamicContext);
        return null;
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
//        return switchNode;
        return null;
    }

}
