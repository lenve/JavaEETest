package org.sang;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sang on 2017/1/10.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "index";
    }
}
