package cz.upce.fei.inptp.citest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "<a href=\"/response\">Hello world from HelloController</a>";
    }
    
    @RequestMapping("/response")
    public String response() {
        Model m = new Model();
        return m.respond("test");
    }
    
}
