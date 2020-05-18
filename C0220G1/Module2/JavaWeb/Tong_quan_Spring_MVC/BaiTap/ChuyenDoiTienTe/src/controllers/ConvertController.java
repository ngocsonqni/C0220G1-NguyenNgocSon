package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ConvertService;

@Controller
public class ConvertController {

    @Autowired
    ConvertService convertService;

    @GetMapping("/convert")
    public String convert(@RequestParam String USD, @RequestParam String tiGiaUSD, Model model){
        int convert=convertService.convert(Integer.parseInt(USD),Integer.parseInt(tiGiaUSD));
        model.addAttribute("USD",USD);
        model.addAttribute("tiGiaUSD",tiGiaUSD);
        model.addAttribute("convert",convert);
        return "result";
    }
}
