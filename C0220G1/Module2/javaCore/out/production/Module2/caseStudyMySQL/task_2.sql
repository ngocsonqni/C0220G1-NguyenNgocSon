select *
from nhanvien
where (HoTen like 'H%' or HoTen like 'T%' or HoTen like 'K%') and length(HoTen)<=15;



