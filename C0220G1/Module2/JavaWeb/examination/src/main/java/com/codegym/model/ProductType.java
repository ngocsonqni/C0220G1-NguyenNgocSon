package com.codegym.model;


import javax.persistence.*;

@Entity
@Table(name="producttype")
public class ProductType {
    @Id
    @Column(name = "loaiHang")
    private String loaiHang;

    @Column(name = "moTa")
    private String moTa;

    public ProductType() {
    }

    public String getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
