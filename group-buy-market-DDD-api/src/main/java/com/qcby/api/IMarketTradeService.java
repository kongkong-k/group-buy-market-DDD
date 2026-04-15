package com.qcby.api;

import com.qcby.api.dto.LockMarketPayOrderRequestDTO;
import com.qcby.api.dto.LockMarketPayOrderResponseDTO;
import com.qcby.api.response.Response;

public interface IMarketTradeService {
    /**
     * 营销锁单
     *
     * @param requestDTO 锁单商品信息
     * @return 锁单结果信息
     */
    Response<LockMarketPayOrderResponseDTO> lockMarketPayOrder(LockMarketPayOrderRequestDTO requestDTO);

}
