select *
from khachhang
where (year(NgaySinh) between 1970 and 2002) and (DiaChi='Đà Nẵng' or DiaChi='Quảng Trị');
