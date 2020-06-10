
create table ViTri(
	IDViTri int primary key not null,
    TenViTri varchar(45)
);

create table TrinhDo(
	IDTrinhDo int primary key not null,
    TrinhDo varchar(45) 
);

create table BoPhan(
	IDBoPhan int primary key not null,
    TenBoPhan varchar(45) 
);

create table NhanVien(
	IDNhanVien int primary key not null,
    HoTen varchar(45),
    IDViTri int not null,
    IDTrinhDo int not null,
    IDBoPhan int not null,
    NgaySinh date,
    SoCMND varchar(45),
    Luong varchar(45),
    SDT varchar(45),
    Email varchar(45),
    DiaChi varchar(45),
    foreign key(IDViTri) references ViTri(IDViTri),
    foreign key(IDTrinhDo) references TrinhDo(IDTrinhDo),
    foreign key(IDBoPhan) references BoPhan(IDBoPhan)
);

create table DichVuDiKem(
	IDDichVuDiKem int not null primary key,
    TenDichVuDiKem varchar(45),
    Gia int,
    DonVi int,
    TrangThaiKhaDung varchar(45)
);

create table LoaiKhach(
	IDLoaiKhach int primary key not null,
    TenLoaiKhach varchar(45)
);

create table KhachHang(
	IDKhachHang int primary key not null,
    IDLoaiKhach int not null,
    HoTen varchar(45),
	NgaySinh date,
    SoCMND varchar(45),
    SDT varchar(45),
    Email varchar(45),
    DiaChi varchar(45),
    foreign key(IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
);

create table KieuThue(
	IDKieuThue int primary key not null,
    TenKieuThue int,
    Gia int
);

create table LoaiDichVu(
	IDLoaiDichVu int primary key not null,
    TenDichVu varchar(45)
);

create table DichVu(
	IDDichVu int primary key not null,
    TenDichVu varchar(45),
    DienTich int,
    SoTang int,
    SoNguoiToiDa varchar(45),
    ChiPhiThue varchar(45),
    IDKieuThue int not null,
    IDLoaiDichVu int not null,
    foreign key(IDKieuThue) references KieuThue(IDKieuThue),
    foreign key(IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu)
);

create table HopDong(
	IDHopDong int primary key not null,
    IDNhanVien int not null,
    IDKhachHang int not null,
    IDDichVu int not null,
    NgayLamHopDong date,
    NgayKetThuc date,
    TienDatCoc int,
    TongTien int,
    foreign key(IDNhanVien) references NhanVien(IDNhanVien),
    foreign key(IDKhachHang) references KhachHang(IDKhachHang),
    foreign key(IDDichVu) references DichVu(IDDichVu)
);

create table HopDongChiTiet(
	IDHopDongChiTiet int not null primary key,
    IDHopDong int not null,
    IDDichVuDiKem int not null,
    SoLuong int,
    foreign key(IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem),
    foreign key(IDHopDong) references HopDong(IDHopDong)
);