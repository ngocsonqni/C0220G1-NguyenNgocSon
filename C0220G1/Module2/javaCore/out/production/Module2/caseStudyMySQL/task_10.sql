select hd.IDHopDong,hd.NgayLamHopDong,hd.NgayKetthuc,hd.TienDatCoc,count(hdct.IDHopDongChiTiet) as SoLuongDichVuDiKem
from HopDong as hd
	inner join HopDongChiTiet as hdct on hd.IDHopDong=hdct.IDHopDong
group by hd.IDHopDong;

