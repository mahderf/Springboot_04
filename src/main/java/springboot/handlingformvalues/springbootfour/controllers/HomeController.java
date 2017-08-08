package springboot.handlingformvalues.springbootfour.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/loadform")
    public String loadformpage()
    {
        return"formtemplate";
    }
    @RequestMapping("/processform")
    public String loadform(@RequestParam("login") String login, Model model)
    {
        model.addAttribute("loginval", login);
        return "confirm";
    }
}
