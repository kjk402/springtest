package bat.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {

    @GetMapping("/hello")
    public String welcome() {
        System.out.println("Welcome!!");
        return "welcome";
    }

}
