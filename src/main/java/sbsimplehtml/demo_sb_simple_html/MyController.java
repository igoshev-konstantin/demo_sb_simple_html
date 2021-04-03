package sbsimplehtml.demo_sb_simple_html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/second")
    public String getSecondPage(){
        return "second";
    }
}
