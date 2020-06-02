package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "dichvu")
public class ServiceResort {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "iddichvu")
    private int idDichVu;

    @Column(name = "madichvu")
    @NotEmpty(message = "Mã dịch vụ không được để trống")
    @Pattern(regexp = "(DV-)[0-9]{4}", message ="Mã dịch vụ có định dạng là DV-XXXX (X là số 0-9)")
    private String maDichVu;


    @Column(name = "tendichvu")
    @NotEmpty(message = "Tên dịch vụ không được để trống")
    private String tenDichVu;

    @Column(name = "dientich")
    @Min(value=1,message = "Diện tích phải là số dương lớn hơn 0")
    private int dienTich;

    @Column(name = "sotang")
    @Min(value=1,message = "Số tầng phải là số dương lớn hơn 0")
    private int soTang;

    @Column(name = "songuoitoida")
    @Min(value=1,message = "Số người tối đa phải là số dương lớn hơn 0")
    private int soNguoiToiDa;

    @Column(name = "chiphithue")
    @Min(value=1,message = "Chi phí thuê phải là số dương lớn hơn 0")
    private int chiPhiThue;

    public ServiceResort() {
    }

    public int getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(int idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }
}
