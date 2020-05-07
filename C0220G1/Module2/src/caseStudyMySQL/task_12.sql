select dv.TenDichVu, hd.IDHopDong, nv.HoTen, lk.TenLoaiKhach, kh.HoTen, 
		sum(hdct.SoLuong) as SoLuongDichVuDiKem,hd.TienDatCoc
from DichVu as dv
	left join HopDong as hd on dv.IDDichVu=hd.IDDichVu
    left join NhanVien as nv on hd.IDNhanVien=nv.IDNhanVien
    left join KhachHang as kh on hd.IDKhachHang=kh.IDKhachHang
    left join LoaiKhach as lk on kh.IDLoaiKhach=lk.IDLoaiKhach
    left join HopDongChiTiet as hdct on hd.IDHopDong=hdct.IDHopDong
where dv.IDDichVu in 
		( select DichVu.IDDichVu 
		  from DichVu 
				inner join HopDong on DichVu.IDDichVu=HopDong.IDDichVu
          where month(HopDong.NgayLamHopDong)>=10 and year(HopDong.NgayLamHopDong)=2019)
	and dv.IDDichVu not in 
		( select DichVu.IDDichVu 
		  from DichVu 
			inner join HopDong on DichVu.IDDichVu=HopDong.IDDichVu
          where month(HopDong.NgayLamHopDong)<=6 and year(HopDong.NgayLamHopDong)=2019)

group by dv.TenDichVu
