select dv.IDDichVu,dv.TenDichVu,dv.DienTich,dv.SoNguoiToiDa,dv.ChiPhiThue,ldv.TenLoaiDichVu 
from DichVu as dv
	inner join LoaiDichVu as ldv on dv.IDLoaiDichVu=ldv.IDLoaiDichVu
    inner join HopDong as hd on dv.IDDichVu=hd.IDDichVu
where dv.IDDichVu in(select DichVu.IDDichVu from DichVu where year(hd.NgayLamHopDong)=2018)
	and dv.IDDichVu not in(select DichVu.IDDichVu from DichVu where year(hd.NgayLamHopDong)=2019)
