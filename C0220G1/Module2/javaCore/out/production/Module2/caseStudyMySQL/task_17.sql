update KhachHang
set KhachHang.IdLoaiKhach=1
where KhachHang.IDKhachHang in(
		select x.IDKhachHang
        from (select kh.IDKhachHang, sum(hd.TongTien) as TT
				from khachhang as kh
					inner join HopDong as hd on kh.IDKhachHang=hd.IDKhachHang
				where kh.IDLoaiKhach=2 and year(hd.NgayLamHopDong)=2019
				group by kh.IDKhachHang) as x
        where TT>10000000
		)