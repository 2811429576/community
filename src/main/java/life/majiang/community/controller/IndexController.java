package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shkstart
 * @create 2020-08-02-8:33
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String hello() {
        return "index";
    }

}
