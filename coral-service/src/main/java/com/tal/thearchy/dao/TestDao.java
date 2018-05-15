package com.tal.thearchy.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author sunzhandong
 */
@Repository("testDao")
public interface TestDao {
     /**
      * get info from database
      * @return List<Map<String,Object>>
      */
     List<Map<String,Object>> getInfo();
}
