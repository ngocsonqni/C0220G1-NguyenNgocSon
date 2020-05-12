package service;
import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "IPhone", 1000000, "SanPham1","China"));
        products.put(2, new Product(2, "SamSung", 900000, "SanPham2","Laos"));
        products.put(3, new Product(3, "Oppo", 800000, "SanPham3","Campuchia"));
        products.put(4, new Product(4, "Xiaomi", 700000, "SanPham4","VietNam"));
        products.put(5, new Product(5, "Vivo", 600000, "SanPham5","Japan"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public List<Product> findByName(String tenSanPham) {
        List<Product> productSearch=new ArrayList<>();
        for (int i : products.keySet()) {
           if (tenSanPham.equals(products.get(i).getTenSanPham()))
               productSearch.add(products.get(i));
        }
       return productSearch;
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
