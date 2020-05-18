package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpiceController {

    @RequestMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        for (int i=0;i<condiment.length;i++){
            model.addAttribute("condiment"+i,condiment[i]);
        }
        return "choice";
    }
}
