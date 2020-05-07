select nv.IDNhanVien, nv.HoTen, td.TrinhDo, bp.TenBoPhan, nv.SDT, nv.DiaChi,SoLuongHopDong.SoHopDong
from NhanVien as nv
	inner join TrinhDo as td on nv.IDTrinhDo=td.IDTrinhDo
    inner join BoPhan as bp on nv.IDBoPhan=bp.IDBoPhan
    inner join (select hd.IDNhanVien,count(hd.IDHopDong) as SoHopDong
					from HopDong as hd
                    group by hd.idnhanvien
                ) as SoLuongHopDong on nv.IDNhanVien=SoLuongHopDong.IDNhanVien
where SoLuongHopDong.SoHopDong<=3
group by nv.IDNhanVien	
;