select kh.IDKhachHang, kh.HoTen, lk.TenLoaiKhach, hd.IDHopDong, ldv.TenLoaiDichVu,
		hd.NgayLamHopDong, hd.NgayKetThuc, sum(dv.ChiPhiThue+dvdk.gia*dvdk.DonVi) as TongTien
from KhachHang as kh
	left join LoaiKhach as lk on kh.IDLoaiKhach=lk.IDLoaiKhach
	left join HopDong as hd  on kh.IDKhachHang=hd.IDKhachHang
    left join DichVu as dv on hd.IDDichVu=dv.IDDichVu
    left join LoaiDichVu as ldv on dv.IDLoaiDichVu=ldv.IDLoaiDichVu
    left join HopDongChiTiet as hdct on hdct.IDHopDong=hd.IDHopDong
    left join DichVuDiKem as dvdk on hdct.IDDichVuDiKem=dvdk.IDDichVuDiKem
group by kh.IDKhachHang


