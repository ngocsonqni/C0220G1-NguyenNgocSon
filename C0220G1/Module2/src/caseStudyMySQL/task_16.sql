delete from NhanVien
where NhanVien.IDNhanVien in 
	(select hd.IDNhanVien
	from  HopDong as hd 
	where year(hd.NgayLamHopDong) < 2017 or year(hd.NgayLamHopDong)> 2019
	group by hd.IDNhanVien)


