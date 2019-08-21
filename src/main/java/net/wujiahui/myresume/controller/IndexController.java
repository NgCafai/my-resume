package net.wujiahui.myresume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by NgCafai on 2019/8/20 16:07.
 */
@Controller
public class IndexController {

    @RequestMapping(path = "/")
    public String getIndexPage() {
        return "index";
    }

}
