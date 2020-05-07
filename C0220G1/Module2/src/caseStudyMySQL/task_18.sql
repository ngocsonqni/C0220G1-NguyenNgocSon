delete from KhachHang
where KhachHang.IDKhachHang in 
	(select hd.IDKhachHang
	from  HopDong as hd 
	where year(hd.NgayLamHopDong) < 2016
	group by hd.IDKhachHang)
    