select dv.IDDichVu, dv.TenDichVu, dv.DienTich, dv.ChiPhiThue, ldv.TenLoaiDichVu
from DichVu as dv
	inner join LoaiDichVu as ldv on dv.IDLoaiDichVu=ldv.IDLoaiDichVu
	inner join HopDong as hd on dv.IDDichVu = hd.IDDichVu
where dv.IDDichVu not in 
(select DichVu.IDDichVu from DichVu where month(hd.NgayLamHopDong) between 1 and 3) and(year(hd.NgayLamHopDong)=2019 )

