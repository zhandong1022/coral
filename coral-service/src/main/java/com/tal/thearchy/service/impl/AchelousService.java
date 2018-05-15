package com.tal.thearchy.service.impl;

import com.tal.thearchy.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * test spring mvc
 * @author sunzhandong
 */
@Service("achelousService")
public class AchelousService {

    @Autowired
    private TestDao testDao;

    public void toDao(){

        System.out.print("AchelousService");
        List<Map<String,Object>> daoMap = testDao.getInfo();

        System.out.print("Success");

    }
}
