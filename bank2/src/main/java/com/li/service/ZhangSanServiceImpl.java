package com.li.service;



import com.li.dao.LiSiSanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liql
 * @date 2021/7/24
 */
@Service
public class ZhangSanServiceImpl implements LiSiService {

    @Autowired
    private LiSiSanDao liSiDao;

    @Override
    @Transactional//开启本地事务
  //  @GlobalTransactional//开启全局事务
    public void updateAccount(double account) {
        //因为张三的编号 accountNo 为 1

        liSiDao.updateAccount("2", account);
//        int a=10/0;
    }
}
