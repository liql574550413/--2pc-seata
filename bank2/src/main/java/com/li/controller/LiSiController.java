package com.li.controller;

import com.li.service.LiSiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author liql
 * @date 2021/7/24
 */
@RestController
public class LiSiController {

    @Autowired
    private LiSiService liSiService;

    @RequestMapping("/update/{accuont}")
    public String updateAccount(@PathVariable("accuont") double account){

        System.out.println("进入controller层 accuont="+account);
        liSiService.updateAccount(account);
        return "bank2 已经操作";
    }
}
