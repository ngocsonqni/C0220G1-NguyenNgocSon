package service.impl;

import org.springframework.stereotype.Service;
import service.ConvertService;

@Service
public class ConvertServiceImpl implements ConvertService {
    @Override
    public int convert(int USD, int tiGiaUSD) {
        return USD*tiGiaUSD;
    }
}
