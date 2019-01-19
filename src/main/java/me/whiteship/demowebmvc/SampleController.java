package me.whiteship.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(method = RequestMethod.GET)
public class SampleController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

}
