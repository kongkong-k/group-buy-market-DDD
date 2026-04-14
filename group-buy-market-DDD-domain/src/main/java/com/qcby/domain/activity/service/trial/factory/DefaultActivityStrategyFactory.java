package com.qcby.domain.activity.service.trial.factory;

import com.qcby.domain.activity.model.entity.MarketProductEntity;
import com.qcby.domain.activity.model.entity.TrialBalanceEntity;
import com.qcby.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.qcby.domain.activity.model.valobj.SkuVO;
import com.qcby.domain.activity.service.trial.node.RootNode;
import com.qcby.types.design.framework.tree.StrategyHandler;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @description 默认活动策略工厂
 */
@Service
public class DefaultActivityStrategyFactory {

    // 构造函数实现注入
    private final RootNode rootNode;

    public DefaultActivityStrategyFactory(RootNode rootNode) {
        this.rootNode = rootNode;
    }

    public StrategyHandler<MarketProductEntity, DynamicContext, TrialBalanceEntity> strategyHandler() {
        return rootNode;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DynamicContext {
        // 拼团活动营销配置值对象
        private GroupBuyActivityDiscountVO groupBuyActivityDiscountVO;
        // 商品信息
        private SkuVO skuVO;
        // 折扣金额
        private BigDecimal deductionPrice;
        // 支付金额
        private BigDecimal payPrice;
        // 活动可见性限制
        private boolean visible;
        // 活动
        private boolean enable;
    }

}
