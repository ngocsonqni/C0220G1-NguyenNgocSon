select DISTINCT KhachHang.HoTen
from KhachHang;

select KhachHang.HoTen
from KhachHang 
group by KhachHang.HoTen;

select kh1.HoTen
from KhachHang as kh1
	inner join KhachHang as kh2 on kh1.IDKhachHang=kh2.IDKhachHang
where kh1.IDKhachHang not in
	(select kh1.IDKhachHang
	from KhachHang as kh1
		inner join KhachHang as kh2
    where kh1.IDKhachHang < kh2.IDKhachHang and kh1.HoTen=kh2.HoTen);

