package met.controller;

import met.model.Method;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

/*    @ModelAttribute("method")
    public Method method() {
        return new Method();
    }*/

    @GetMapping("/logining")
    public String openMethod(Model model) {
        return "logining";
    }

}
