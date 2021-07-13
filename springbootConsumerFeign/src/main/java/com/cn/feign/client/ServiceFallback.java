package com.cn.feign.client;

import com.cn.feign.entity.RestfulResult;
import com.cn.feign.entity.ServiceInfo;
import org.springframework.stereotype.Component;

/**
 * @Author 孟小耀
 * @Date 2021/7/13 4:06
 */
@Component
public class ServiceFallback implements ServiceFeignClient{

    @Override
    public RestfulResult hello(ServiceInfo serviceInfo) {
        RestfulResult result = new RestfulResult();
        result.setData("服务调用失败");
        return result;
    }
}
