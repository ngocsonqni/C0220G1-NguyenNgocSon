package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Operator;

@Controller
public class caculatorController {

    @Autowired
    Operator caculation;

    @GetMapping("/caculator")
    public String showCaculator(){
        return "index";
    }
    @PostMapping("/caculator")
    public String caculator(@RequestParam String num1, @RequestParam String num2, @RequestParam String operator, Model model){
        int result = 0;
        switch (operator){
            case "Addition(+)":
                result=caculation.addition(Integer.parseInt(num1),Integer.parseInt(num2));
                break;
            case "Subtraction(-)":
                result=caculation.subtraction(Integer.parseInt(num1),Integer.parseInt(num2));
                break;
            case "Multiplication(*)":
                result=caculation.multiplication(Integer.parseInt(num1),Integer.parseInt(num2));
                break;
            case "Division(/)":
                result=caculation.division(Integer.parseInt(num1),Integer.parseInt(num2));
                break;
            default:
                break;
        }
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        model.addAttribute("result",result);
        return "index";
    }
}
