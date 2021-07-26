package com.li.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liql
 * @date 2020/12/19
 *
 * 这个接口不需要写实例类  直接在控制层调用 ，然后传参给这个接口
 * 这个接口变回把参数传给服务提供者的controller层。
 */
@Component
@FeignClient(value = "BANK2APP")//服务名称，要和eureka上面的一致才行
public interface FeignService {
    //这个就是provider 的controller层的方法定义。
    @GetMapping(value = "/update/{account}")
    void updateAccount(@PathVariable("account") double account);


}
