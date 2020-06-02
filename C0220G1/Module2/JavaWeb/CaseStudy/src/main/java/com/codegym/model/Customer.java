package com.codegym.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "khachhang")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idkhachhang")
    private int idKhachHang;

    @Column(name = "makhachhang")
    @NotEmpty(message = "Mã khách hàng không được để trống")
    @Pattern(regexp = "(KH-)[0-9]{4}", message ="Mã Khách hàng có định dạng là KH-XXXX (X là số từ 0-9)" )
    private String maKhachHang;

    @NotEmpty(message = "Họ tên không được để trống")
    @Column(name = "hoten")
    private String hoTen;

    @Column(name = "ngaysinh")
    @Pattern(regexp = "^[0-9]{4}-(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])$",message = "Ngày sinh phải theo định dạng yyyy-mm-dd")
//    @Pattern(regexp = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$",message = "Ngày sinh phải theo định dạng dd/mm/yyyy")
    private String ngaySinh;

    @Column(name = "socmnd")
    @NotEmpty(message = "Chứng minh nhân dân không được để trống")
    @Pattern(regexp = "[0-9]{9}", message ="Chứng minh nhân dân phải nhập đúng 9 số" )
    private String cmnd;

    @Column(name = "sdt")
    @NotEmpty(message = "Sdt không được để trống")
    @Pattern(regexp = "(|(090)|(091))[0-9]{7}", message ="Sdt có 10 số,bắt đầu bằng 090/091" )
    private String sdt;

    @Column(name = "email")
    @NotEmpty(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    private String email;

    @Column(name = "diachi")
    private String diaChi;



    public Customer() {
    }
    public Customer(int idKhachHang,String hoTen,String ngaySinh,String cmnd,String sdt,String email,String diaChi){
        this.idKhachHang=idKhachHang;
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.cmnd=cmnd;
        this.sdt=sdt;
        this.email=email;
        this.diaChi=diaChi;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
