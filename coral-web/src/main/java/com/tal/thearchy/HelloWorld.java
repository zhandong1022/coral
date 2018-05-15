package com.tal.thearchy;

import com.tal.thearchy.service.impl.AchelousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunzhandong
 */
@Controller
@RequestMapping("helloWorld")
public class HelloWorld {

    @Autowired
    private AchelousService achelousService;

    @RequestMapping("toService")
    public void toService(){
        achelousService.toDao();
    }

}
