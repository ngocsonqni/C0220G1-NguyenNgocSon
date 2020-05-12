select KhachHang.HoTen, count(HopDong.IDHopDong) SoLanDatPhong
from KhachHang
inner join HopDong on KhachHang.IDKhachHang=HopDong.IDKhachHang
inner join LoaiKhach on KhachHang.IDLoaiKhach=LoaiKhach.IDLoaiKhach
where LoaiKhach.TenLoaiKhach='Diamond'
group by KhachHang.HoTen
order by SoLanDatPhong asc