package com.li.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author liql
 * @date 2021/7/24
 */
@Mapper
public interface ZhangSanDao {

    //更新账户金额 扣减张三账户金额
    @Update("update account_info set account_balance = account_balance + #{amount} where account_no = #{accountNo}")
    int updateAccount(@Param("accountNo") String accountNo, @Param("amount") Double amount );
}

