package com.codegym.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idhopdong")
    private int idHopDong;

    @Column(name = "mahopdong")
    @NotEmpty(message = "Mã khách hàng không được để trống")
    @Pattern(regexp = "(HD-)[0-9]{4}", message ="Mã hợp đồng có định dạng là HD-XXXX (X là số từ 0-9)" )
    private String maHopDong;

    @Column(name = "ngaylamhopdong")
    @Pattern(regexp = "^[0-9]{4}-(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])$",message = "Ngày làm hợp đồng phải theo định dạng yyyy-mm-dd")
//    @Pattern(regexp = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$",message = "Ngày làm hợp đồng phải theo định dạng dd/mm/yyyy")
    private String ngayLamHopDong;

    @Column(name = "ngayketthuc")
    @Pattern(regexp = "^[0-9]{4}-(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])$",message = "Ngày kết thúc hợp đồng phải theo định dạng yyyy-mm-dd")

//    @Pattern(regexp = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$",message = "Ngày kết thúc phải theo định dạng dd/mm/yyyy")
    private String ngayKetThuc;

    @Column(name = "tiendatcoc")
    @Min(value=1,message = "Tiền đặt cọc phải là số dương lớn hơn 0")
    private int tienDatCoc;

    @Column(name = "tongtien")
    @Min(value=1,message = "Tổng tiền phải là số dương lớn hơn 0")
    private int tongTien;



    @ManyToOne
    @JoinColumn(name = "idkhachhang")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "iddichvu")
    private ServiceResort serviceResort;

    public Contract() {
    }

    public int getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(int idHopDong) {
        this.idHopDong = idHopDong;
    }

    public String getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(String ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(int tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ServiceResort getServiceResort() {
        return serviceResort;
    }

    public void setServiceResort(ServiceResort serviceResort) {
        this.serviceResort = serviceResort;
    }
}
