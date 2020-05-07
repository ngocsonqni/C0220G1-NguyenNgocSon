select month(hd.NgayLamHopDong) as Thang, count(hd.IDHopDong) as SoKhachDatPhong, sum(hd.TongTien) as DoanhThu
from HopDong as hd
where year(hd.NgayLamHopDong)=2019
group by Thang;