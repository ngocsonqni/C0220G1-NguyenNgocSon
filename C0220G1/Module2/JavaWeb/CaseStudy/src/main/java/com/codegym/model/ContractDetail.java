package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="idhopdongchitiet")
    private int idHopDongChiTiet;

    @Column(name ="mahopdongchitiet")
    @NotEmpty(message = "Mã khách hàng không được để trống")
    @Pattern(regexp = "(HDCT-)[0-9]{4}", message ="Mã hợp đồng có định dạng là HDCT-XXXX (X là số từ 0-9)" )
    private String maHopDongChiTiet;

    @Column(name = "tendichvudikem")
    @NotEmpty(message = "Tên dịch vụ đi kèm không được để trống")
    private String tenDichVuDiKem;

    @Column(name = "soluong")
    @Min(value=1,message = "Số lượng phải là số dương lớn hơn 0")
    private int soLuong;

    @ManyToOne
    @JoinColumn(name = "idhopdong")
    @NotNull(message = "ID hợp đồng không được để trống")
    private Contract contract;

    public ContractDetail() {
    }

    public int getIdHopDongChiTiet() {
        return idHopDongChiTiet;
    }

    public void setIdHopDongChiTiet(int idHopDongChiTiet) {
        this.idHopDongChiTiet = idHopDongChiTiet;
    }

    public String getMaHopDongChiTiet() {
        return maHopDongChiTiet;
    }

    public void setMaHopDongChiTiet(String maHopDongChiTiet) {
        this.maHopDongChiTiet = maHopDongChiTiet;
    }

    public String getTenDichVuDiKem() {
        return tenDichVuDiKem;
    }

    public void setTenDichVuDiKem(String tenDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
