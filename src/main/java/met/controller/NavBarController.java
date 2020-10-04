package met.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavBarController {

/*    @ModelAttribute("method")
    public Method method() {
        return new Method();
    }*/

    @GetMapping("/navbar")
    public String openMethod(Model model) {
        return "navbar";
    }

}
