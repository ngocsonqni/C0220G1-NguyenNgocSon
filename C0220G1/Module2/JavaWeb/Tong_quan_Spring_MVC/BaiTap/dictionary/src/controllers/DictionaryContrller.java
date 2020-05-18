package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryService;

@Controller
public class DictionaryContrller {

    @Autowired
    DictionaryService dictionaryService;
    @GetMapping("/dictionary")
    public String dictionnary(@RequestParam String eng, Model model){
        String vie=dictionaryService.trans(eng);
        if (vie==null){
            model.addAttribute("dictionnaryEng",eng);
            model.addAttribute("dictionnaryVie","Không có kết quả phù hợp");
            return "result";
        }else{
            model.addAttribute("dictionnaryEng",eng);
            model.addAttribute("dictionnaryVie",vie);
            return "result";
        }

    }
}
