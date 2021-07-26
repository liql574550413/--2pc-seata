package com.li.controller;

import com.li.service.ZhangSanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liql
 * @date 2021/7/24
 */
@RestController
public class ZhangSanController {
    @Autowired
    private ZhangSanService zhangSanService;

    @GetMapping("/update")
    public String update(@RequestParam("account") double account){
        zhangSanService.updateAccount(account);
        return "bank1 操作完成";
    }
}
