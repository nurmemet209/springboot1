package com.rk.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by Administrator on 1/18/2017.
 */
@Controller
public class MyController {

    @GetMapping("/index")
    public String index(Map<String, Object> model){
        model.put("msg","welocme");
        return "index";
    }
}
