select dvdk.*
from DichVuDiKem as dvdk
	inner join HopDongChiTiet as hdct on dvdk.IDDichVuDiKem=hdct.IDDichVuDiKem
    inner join HopDong as hd on hdct.IDHopDong=hd.IDHopDong
    inner join KhachHang as kh on hd.IDKhachHang=kh.IDKhachHang
    inner join LoaiKhach as lk on kh.IDLoaiKhach=lk.IDLoaiKhach
where lk.TenLoaiKhach='Diamond' and (kh.DiaChi='Vinh' or kh.DiaChi='Quảng Ngãi')

