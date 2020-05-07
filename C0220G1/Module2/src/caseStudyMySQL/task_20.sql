select nv.IDNhanVien as ID, nv.HoTen, nv.Email, nv.SDT, nv.NgaySinh, nv.DiaChi
from NhanVien as nv
union all
select kh.IDKhachHang as ID,  kh.HoTen,  kh.Email, kh.SDT, kh.NgaySinh, kh.DiaChi
from KhachHang as kh