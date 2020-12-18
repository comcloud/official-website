package com.cloud.officialwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 成都犀牛
 * @version version 1.0
 * @date 2020/12/13 11:03
 */
@Controller
public class IndexController {

    @RequestMapping(value ={"/" ,"/index"})
    public String goToOfficialWeb(){
        return "official-website/bl-first-index";
    }
    @RequestMapping(value = "/list")
    public String goToList(){
        return "official-website/bl-aritical-list";
    }

    @RequestMapping(value = "/compli")
    public String goCompli(){
        return "official-website/ydx-compli";
    }
    @RequestMapping(value = "/coop")
    public String goToCoop(){
        return "official-website/ydx-coop";
    }
    @RequestMapping(value = "/about")
    public String goAbout1(){
        return "official-website/bl-about";
    }
    @RequestMapping(value = "/about2")
    public String goToAbout2(){
        return "official-website/bl-about2";
    }

}
