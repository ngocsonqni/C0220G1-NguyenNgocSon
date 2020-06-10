package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "maHang")
    private int maHang;

    @NotEmpty(message = "Tên hàng không được để trống")
    @Column(name = "tenHang")
    private String tenHang;

    @Column(name = "giaHang")
    @NotNull(message = "Giá hàng không được để trống")
    @Min(value=1,message = "Giá hàng phải là số dương lớn hơn 0")
    private int giaHang;

    @Column(name = "soLuong")
    @Min(value=1,message = "Số lượng hàng phải là số dương lớn hơn 0")
    private int soLuong;

    @Column(name = "ngayTao")
    private Date ngayTao;

    @Column(name = "moTa")
    private String moTa;

    @ManyToOne
    @JoinColumn(name = "loaiHang")
    private ProductType productType;

    public Product() {
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getGiaHang() {
        return giaHang;
    }

    public void setGiaHang(int giaHang) {
        this.giaHang = giaHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
