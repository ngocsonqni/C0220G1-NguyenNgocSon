package service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryServiceImpl implements DictionaryService{
    static Map<String,String> dic= new HashMap<>();
    static {
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
    }
    @Override
    public String trans(String eng) {
        return dic.get(eng);
    }
}
