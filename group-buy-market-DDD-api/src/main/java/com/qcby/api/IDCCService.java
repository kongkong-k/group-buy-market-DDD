package com.qcby.api;


import com.qcby.api.response.Response;

/**
 * @description DCC 动态配置中心
 */
public interface IDCCService {

    Response<Boolean> updateConfig(String key, String value);

}
