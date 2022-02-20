package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping("/helloworld")
    public String helloWorld(){
        return "helloworld";
    }
}
