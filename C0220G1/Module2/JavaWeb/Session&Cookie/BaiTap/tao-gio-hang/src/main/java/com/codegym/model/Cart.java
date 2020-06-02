package com.codegym.model;

import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    private Map<Long,Product> products;
    private Map<Long,Integer> counts=new HashMap<>();

    public Map<Long, Integer> getCounts() {
        return counts;
    }

    public void setCounts(Map<Long, Integer> counts) {
        this.counts = counts;
    }
    public void addCounts(long id,int count){
        counts.put(id,count);
    }
    public int findCount(long id){
        return counts.get(id);
    }
    public List<Integer> getCount(){
        return new ArrayList<>(counts.values());
    }

    public long totalPay(){
        long totalPay=0;
        for (long i:products.keySet()){
            totalPay+=products.get(i).getCost()*counts.get(i);
        }
        return totalPay;
    }

    public Cart() {
        this.products = new HashMap<Long, Product>();
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products.values());
    }

    public void setProducts(Map<Long,Product> products) {
        this.products = products;
    }

    public void addToCart(long id,Product product) {
        products.put(id,product);
    }

    public Product findById(long id) {
        return products.get(id);
    }
//    public void removeFromCart(int id) {
//        for(Product product : products){
//            if (product.getId()==id ) {
//                products.remove(product);
//                return;
//            }
//        }
//    }
}